package cloud.shard.inte.three;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import shard.jdbc.common.entity.TableOne;

/**
 * 数据迁移服务接口
 */
@FeignClient(value = "shard-provider-8002")
public interface MoveDataService {
    @RequestMapping("/moveData")
    Integer moveData (@RequestBody TableOne tableOne) ;
}
