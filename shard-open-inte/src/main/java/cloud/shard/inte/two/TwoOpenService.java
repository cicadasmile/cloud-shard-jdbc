package cloud.shard.inte.two;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import shard.jdbc.common.entity.TableOne;
/**
 * shard-two-provider-8001
 * 对外开放接口
 */
@FeignClient(value = "shard-provider-8001")
public interface TwoOpenService {
    @RequestMapping("/selectOneByPhone/{phone}")
    TableOne selectOneByPhone(@PathVariable("phone") String phone) ;
}
