package cloud.shard.provider.service.impl;

import cloud.shard.inte.three.MoveDataService;
import cloud.shard.provider.config.HashUtil;
import cloud.shard.provider.service.ScanDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import shard.jdbc.common.entity.TableOne;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ScanDataServiceImpl implements ScanDataService {

    private static Logger LOG = LoggerFactory.getLogger(ScanDataServiceImpl.class) ;

    @Autowired
    @Qualifier("dataTwoTemplate")
    private JdbcTemplate dataTwoTemplate ;

    /**
     * 8002 端口开放的数据入库接口
     */
    @Resource
    private MoveDataService moveDataService ;
    /**
     * 扫描，并迁移数据
     * 以 库 db_2 的 table_one_1 表为例
     */
    @Override
    public void scanDataRun() {
        String sql = "SELECT id,phone,back_one backOne,back_two backTwo,back_three backThree FROM table_one_1" ;
        // dataTwoTemplate 对应的数据库：ds_2
        List<TableOne> tableOneList = dataTwoTemplate.query(sql,new Object[]{},new BeanPropertyRowMapper<>(TableOne.class)) ;
        if (tableOneList != null && tableOneList.size()>0){
            int i = 0 ;
            for (TableOne tableOne : tableOneList) {
                String db_num = HashUtil.moveDb(tableOne.getPhone()) ;
                String tb_num = HashUtil.moveTable(tableOne.getPhone()) ;
                // 只演示向数据新加库 ds_4 迁移的数据
                if (db_num.equals("ds_4")){
                    i += 1 ;
                    LOG.info("迁移总数数=>" + i + "=>库位置=>"+db_num+"=>表位置=>"+tb_num+"=>数据：【"+tableOne+"】");
                    // 扫描完成：执行新库迁移和旧库清理过程
                    moveDataService.moveData(tableOne) ;
                    // dataTwoTemplate.update("DELETE FROM table_one_1 WHERE id=? AND phone=?",tableOne.getId(),tableOne.getPhone());
                }
            }
        }
    }
}
