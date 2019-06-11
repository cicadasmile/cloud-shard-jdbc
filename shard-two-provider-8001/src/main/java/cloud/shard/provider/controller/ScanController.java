package cloud.shard.provider.controller;

import cloud.shard.provider.service.ScanDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * 扫描迁移数据
 */
@RestController
public class ScanController {

    @Resource
    private ScanDataService scanDataService ;

    @RequestMapping("/scanData")
    public String scanData (){
        scanDataService.scanDataRun();
        return "success" ;
    }
}
