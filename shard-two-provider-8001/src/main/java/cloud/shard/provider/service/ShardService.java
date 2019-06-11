package cloud.shard.provider.service;

import shard.jdbc.common.entity.TableOne;

public interface ShardService {
    void createTable() ;
    void insertOne() ;
    TableOne selectOneByPhone(String phone) ;
}
