package cloud.shard.provider.service.impl;

import shard.jdbc.common.entity.TableOne;
import cloud.shard.provider.mapper.TableOneMapper;
import cloud.shard.provider.service.ShardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ShardServiceImpl implements ShardService {

    @Resource
    private TableOneMapper tableOneMapper ;

    @Autowired
    @Qualifier("dataOneTemplate")
    private JdbcTemplate jdbcTemplate ;

    @Autowired
    @Qualifier("dataTwoTemplate")
    private JdbcTemplate dataTwoTemplate ;

    @Autowired
    @Qualifier("dataThreeTemplate")
    private JdbcTemplate dataThreeTemplate ;

    @Override
    public void createTable() {
        for (int i = 1 ; i <= 5 ; i++){
            String executeSQL = "CREATE TABLE table_test_"+i+" (\n" +
                    "  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',\n" +
                    "  `phone` varchar(20) NOT NULL COMMENT '手机号',\n" +
                    "  `back_one` varchar(50) DEFAULT NULL COMMENT '备用1',\n" +
                    "  `back_two` varchar(50) DEFAULT NULL COMMENT '备用2',\n" +
                    "  `back_three` varchar(50) DEFAULT NULL COMMENT '备用3',\n" +
                    "  PRIMARY KEY (`id`),\n" +
                    "  KEY `phoneIndex` (`phone`)\n" +
                    ") ENGINE=InnoDB DEFAULT CHARSET=utf8;" ;
            jdbcTemplate.execute(executeSQL);
            dataTwoTemplate.execute(executeSQL);
            dataThreeTemplate.execute(executeSQL);
        }
    }

    @Override
    public void insertOne() {
        for (int i = 0 ; i < 10000 ; i++){
            TableOne tableOne = new TableOne() ;
            tableOne.setPhone("phone"+i);
            tableOne.setBackOne("back_one"+i);
            tableOne.setBackTwo("back_two"+i);
            tableOne.setBackThree("back_three"+i);
            tableOneMapper.insert(tableOne) ;
        }
    }

    @Override
    public TableOne selectOneByPhone(String phone) {
        return tableOneMapper.selectOneByPhone(phone);
    }
}
