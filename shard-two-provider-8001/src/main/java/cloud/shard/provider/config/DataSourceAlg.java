package cloud.shard.provider.config;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import java.util.Collection;

/**
 * 数据库映射计算
 */
public class DataSourceAlg implements PreciseShardingAlgorithm<String> {
    @Override
    public String doSharding(Collection<String> names, PreciseShardingValue<String> value) {
        int hash = HashUtil.rsHash(String.valueOf(value.getValue()));
        return "ds_" + ((hash % 2) + 2) ;
    }
}
