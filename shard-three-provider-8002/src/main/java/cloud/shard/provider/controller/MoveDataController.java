package cloud.shard.provider.controller;

import cloud.shard.provider.service.TableOneService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shard.jdbc.common.entity.TableOne;
import javax.annotation.Resource;

/**
 * 基于三台库的数据迁移接口
 */
@RestController
public class MoveDataController {

    private static Logger LOG = LoggerFactory.getLogger(MoveDataController.class) ;

    @Resource
    private TableOneService tableOneService ;

    @RequestMapping("/moveData")
    public Integer moveData(@RequestBody TableOne tableOne) {
        LOG.info("8002 开放的数据入库接口被调用..."+tableOne);
        // return tableOneService.insert(tableOne) ;
        return 1 ;
    }
}
