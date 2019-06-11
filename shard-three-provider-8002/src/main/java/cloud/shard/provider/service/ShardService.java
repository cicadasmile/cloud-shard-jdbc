package cloud.shard.provider.service;

import shard.jdbc.common.entity.TableOne;

public interface ShardService {
    TableOne selectOneByPhone(String phone) ;
}
