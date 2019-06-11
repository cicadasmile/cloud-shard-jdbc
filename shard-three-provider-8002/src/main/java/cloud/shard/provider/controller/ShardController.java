package cloud.shard.provider.controller;

import cloud.shard.provider.service.ShardService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shard.jdbc.common.entity.TableOne;
import javax.annotation.Resource;

@RestController
public class ShardController {

    @Resource
    private ShardService shardService ;

    @RequestMapping("/selectOneByPhone/{phone}")
    public TableOne selectOneByPhone (@PathVariable("phone") String phone){
        return shardService.selectOneByPhone(phone);
    }
}
