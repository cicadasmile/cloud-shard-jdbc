package cloud.shard.provider.service.impl;

import cloud.shard.provider.mapper.TableOneMapper;
import cloud.shard.provider.service.TableOneService;
import org.springframework.stereotype.Service;
import shard.jdbc.common.entity.TableOne;
import javax.annotation.Resource;

@Service
public class TableOneServiceImpl implements TableOneService {

    @Resource
    private TableOneMapper tableOneMapper ;

    @Override
    public int insert(TableOne record) {
        return tableOneMapper.insert(record) ;
    }
}
