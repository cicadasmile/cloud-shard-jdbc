package cloud.shard.inte.three;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shard.jdbc.common.entity.TableOne;

/**
 * shard-two-provider-8001
 * 对外开放接口
 */
@FeignClient(value = "shard-provider-8002")
public interface ThreeOpenService {
    @RequestMapping("/selectOneByPhone/{phone}")
    TableOne selectOneByPhone(@PathVariable("phone") String phone) ;
}
