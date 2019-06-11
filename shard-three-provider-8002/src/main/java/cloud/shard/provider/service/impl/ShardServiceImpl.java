package cloud.shard.provider.service.impl;

import cloud.shard.inte.two.TwoOpenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shard.jdbc.common.entity.TableOne;
import cloud.shard.provider.mapper.TableOneMapper;
import cloud.shard.provider.service.ShardService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ShardServiceImpl implements ShardService {

    private static final Logger LOG = LoggerFactory.getLogger(ShardServiceImpl.class) ;

    @Resource
    private TableOneMapper tableOneMapper ;

    /**
     * 8001 端口 ：基于两台分库分表策略的数据查询接口
     */
    @Resource
    private TwoOpenService twoOpenService ;
    @Override
    public TableOne selectOneByPhone(String phone) {
        TableOne tableOne = tableOneMapper.selectOneByPhone(phone);
        if (tableOne != null){
            LOG.info("8002 === >> tableOne :"+tableOne);
        }
        // 8002 服务没有查到数据
        if (tableOne == null){
            // 调用 8001 开放的查询接口
            tableOne = twoOpenService.selectOneByPhone(phone) ;
            LOG.info("8001 === >> tableOne :"+tableOne);
        }
        return tableOne ;
    }

}
