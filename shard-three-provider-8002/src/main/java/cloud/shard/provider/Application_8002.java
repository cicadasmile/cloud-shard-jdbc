package cloud.shard.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableTransactionManagement
@MapperScan("cloud.shard.provider.mapper")
@EnableFeignClients(basePackages = {"cloud.shard.inte.two", "cloud.shard.inte.three"})
// @ComponentScan("cloud.shard.inte")
public class Application_8002 {
    public static void main(String[] args) {
        SpringApplication.run(Application_8002.class,args) ;
    }
}
