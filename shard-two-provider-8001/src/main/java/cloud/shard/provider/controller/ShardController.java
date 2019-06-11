package cloud.shard.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import shard.jdbc.common.entity.TableOne;
import cloud.shard.provider.service.ShardService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class ShardController {

    private static final Logger LOG = LoggerFactory.getLogger(ShardController.class) ;

    @Resource
    private ShardService shardService ;

    @RequestMapping("/createTable")
    public String createTable (){
        shardService.createTable();
        return "success" ;
    }

    @RequestMapping("/insertOne")
    public String insertOne (){
        shardService.insertOne();
        return "SUCCESS" ;
    }

    @RequestMapping("/selectOneByPhone/{phone}")
    public TableOne selectOneByPhone (@PathVariable("phone") String phone){
        LOG.info("8001 服务被调用... ");
        return shardService.selectOneByPhone(phone);
    }
}
