package cloud.shard.provider.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.shardingsphere.api.config.rule.ShardingRuleConfiguration;
import io.shardingsphere.api.config.rule.TableRuleConfiguration;
import io.shardingsphere.api.config.strategy.StandardShardingStrategyConfiguration;
import io.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 数据库分库分表配置
 */
@Configuration
public class ShardJdbcConfig {

    @Value("${spring.datasource.dataOne.druid.url}")
    private String dbUrl1;
    @Value("${spring.datasource.dataOne.druid.username}")
    private String username1;
    @Value("${spring.datasource.dataOne.druid.password}")
    private String password1;
    @Value("${spring.datasource.dataOne.druid.driverClassName}")
    private String driverClassName1;
    @Value("${spring.datasource.dataOne.druid.initial-size}")
    private int initialSize1;
    @Value("${spring.datasource.dataOne.druid.max-active}")
    private int maxActive1;
    @Value("${spring.datasource.dataOne.druid.min-idle}")
    private int minIdle1;
    @Value("${spring.datasource.dataOne.druid.max-wait}")
    private int maxWait1;
    @Value("${spring.datasource.dataOne.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements1;
    @Value("${spring.datasource.dataOne.druid.max-pool-prepared-statement-per-connection-size}")
    private int maxPoolPreparedStatementPerConnectionSize1;
    @Value("${spring.datasource.dataOne.druid.time-between-eviction-runs-millis}")
    private int timeBetweenEvictionRunsMillis1;
    @Value("${spring.datasource.dataOne.druid.min-evictable-idle-time-millis}")
    private int minEvictableIdleTimeMillis1;
    @Value("${spring.datasource.dataOne.druid.max-evictable-idle-time-millis}")
    private int maxEvictableIdleTimeMillis1;
    @Value("${spring.datasource.dataOne.druid.validation-query}")
    private String validationQuery1;
    @Value("${spring.datasource.dataOne.druid.test-while-idle}")
    private boolean testWhileIdle1;
    @Value("${spring.datasource.dataOne.druid.test-on-borrow}")
    private boolean testOnBorrow1;
    @Value("${spring.datasource.dataOne.druid.test-on-return}")
    private boolean testOnReturn1;
    @Value("{spring.datasource.dataOne.druid.connection-properties}")
    private String connectionProperties1;
    @Bean
    public DruidDataSource dataOneSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dbUrl1);
        datasource.setUsername(username1);
        datasource.setPassword(password1);
        datasource.setDriverClassName(driverClassName1);
        datasource.setInitialSize(initialSize1);
        datasource.setMinIdle(minIdle1);
        datasource.setMaxActive(maxActive1);
        datasource.setMaxWait(maxWait1);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis1);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis1);
        datasource.setMaxEvictableIdleTimeMillis(minEvictableIdleTimeMillis1);
        datasource.setValidationQuery(validationQuery1);
        datasource.setTestWhileIdle(testWhileIdle1);
        datasource.setTestOnBorrow(testOnBorrow1);
        datasource.setTestOnReturn(testOnReturn1);
        datasource.setPoolPreparedStatements(poolPreparedStatements1);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize1);
        datasource.setConnectionProperties(connectionProperties1);
        return datasource;
    }

    @Value("${spring.datasource.dataTwo.druid.url}")
    private String dbUrl2;
    @Value("${spring.datasource.dataTwo.druid.username}")
    private String username2;
    @Value("${spring.datasource.dataTwo.druid.password}")
    private String password2;
    @Value("${spring.datasource.dataTwo.druid.driverClassName}")
    private String driverClassName2;
    @Value("${spring.datasource.dataTwo.druid.initial-size}")
    private int initialSize2;
    @Value("${spring.datasource.dataTwo.druid.max-active}")
    private int maxActive2;
    @Value("${spring.datasource.dataTwo.druid.min-idle}")
    private int minIdle2;
    @Value("${spring.datasource.dataTwo.druid.max-wait}")
    private int maxWait2;
    @Value("${spring.datasource.dataTwo.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements2;
    @Value("${spring.datasource.dataTwo.druid.max-pool-prepared-statement-per-connection-size}")
    private int maxPoolPreparedStatementPerConnectionSize2;
    @Value("${spring.datasource.dataTwo.druid.time-between-eviction-runs-millis}")
    private int timeBetweenEvictionRunsMillis2;
    @Value("${spring.datasource.dataTwo.druid.min-evictable-idle-time-millis}")
    private int minEvictableIdleTimeMillis2;
    @Value("${spring.datasource.dataTwo.druid.max-evictable-idle-time-millis}")
    private int maxEvictableIdleTimeMillis2;
    @Value("${spring.datasource.dataTwo.druid.validation-query}")
    private String validationQuery2;
    @Value("${spring.datasource.dataTwo.druid.test-while-idle}")
    private boolean testWhileIdle2;
    @Value("${spring.datasource.dataTwo.druid.test-on-borrow}")
    private boolean testOnBorrow2;
    @Value("${spring.datasource.dataTwo.druid.test-on-return}")
    private boolean testOnReturn2;
    @Value("{spring.datasource.dataTwo.druid.connection-properties}")
    private String connectionProperties2;
    @Bean
    public DruidDataSource dataTwoSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dbUrl2);
        datasource.setUsername(username2);
        datasource.setPassword(password2);
        datasource.setDriverClassName(driverClassName2);
        datasource.setInitialSize(initialSize2);
        datasource.setMinIdle(minIdle2);
        datasource.setMaxActive(maxActive2);
        datasource.setMaxWait(maxWait2);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis2);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis2);
        datasource.setMaxEvictableIdleTimeMillis(minEvictableIdleTimeMillis2);
        datasource.setValidationQuery(validationQuery2);
        datasource.setTestWhileIdle(testWhileIdle2);
        datasource.setTestOnBorrow(testOnBorrow2);
        datasource.setTestOnReturn(testOnReturn2);
        datasource.setPoolPreparedStatements(poolPreparedStatements2);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize2);
        datasource.setConnectionProperties(connectionProperties2);
        return datasource;
    }

    @Value("${spring.datasource.dataThree.druid.url}")
    private String dbUrl3;
    @Value("${spring.datasource.dataThree.druid.username}")
    private String username3;
    @Value("${spring.datasource.dataThree.druid.password}")
    private String password3;
    @Value("${spring.datasource.dataThree.druid.driverClassName}")
    private String driverClassName3;
    @Value("${spring.datasource.dataThree.druid.initial-size}")
    private int initialSize3;
    @Value("${spring.datasource.dataThree.druid.max-active}")
    private int maxActive3;
    @Value("${spring.datasource.dataThree.druid.min-idle}")
    private int minIdle3;
    @Value("${spring.datasource.dataThree.druid.max-wait}")
    private int maxWait3;
    @Value("${spring.datasource.dataThree.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements3;
    @Value("${spring.datasource.dataThree.druid.max-pool-prepared-statement-per-connection-size}")
    private int maxPoolPreparedStatementPerConnectionSize3;
    @Value("${spring.datasource.dataThree.druid.time-between-eviction-runs-millis}")
    private int timeBetweenEvictionRunsMillis3;
    @Value("${spring.datasource.dataThree.druid.min-evictable-idle-time-millis}")
    private int minEvictableIdleTimeMillis3;
    @Value("${spring.datasource.dataThree.druid.max-evictable-idle-time-millis}")
    private int maxEvictableIdleTimeMillis3;
    @Value("${spring.datasource.dataThree.druid.validation-query}")
    private String validationQuery3;
    @Value("${spring.datasource.dataThree.druid.test-while-idle}")
    private boolean testWhileIdle3;
    @Value("${spring.datasource.dataThree.druid.test-on-borrow}")
    private boolean testOnBorrow3;
    @Value("${spring.datasource.dataThree.druid.test-on-return}")
    private boolean testOnReturn3;
    @Value("{spring.datasource.dataThree.druid.connection-properties}")
    private String connectionProperties3;
    @Bean
    public DruidDataSource dataThreeSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dbUrl3);
        datasource.setUsername(username3);
        datasource.setPassword(password3);
        datasource.setDriverClassName(driverClassName3);
        datasource.setInitialSize(initialSize3);
        datasource.setMinIdle(minIdle3);
        datasource.setMaxActive(maxActive3);
        datasource.setMaxWait(maxWait3);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis3);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis3);
        datasource.setMaxEvictableIdleTimeMillis(minEvictableIdleTimeMillis3);
        datasource.setValidationQuery(validationQuery3);
        datasource.setTestWhileIdle(testWhileIdle3);
        datasource.setTestOnBorrow(testOnBorrow3);
        datasource.setTestOnReturn(testOnReturn3);
        datasource.setPoolPreparedStatements(poolPreparedStatements3);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize3);
        datasource.setConnectionProperties(connectionProperties3);
        return datasource;
    }

    /**
     * JDBC操作配置
     */
    @Bean(name = "dataOneTemplate")
    public JdbcTemplate dataOneTemplate (@Autowired DruidDataSource dataOneSource){
        return new JdbcTemplate(dataOneSource) ;
    }
    @Bean(name = "dataTwoTemplate")
    public JdbcTemplate dataTwoTemplate (@Autowired DruidDataSource dataTwoSource){
        return new JdbcTemplate(dataTwoSource) ;
    }
    @Bean(name = "dataThreeTemplate")
    public JdbcTemplate dataThreeTemplate (@Autowired DruidDataSource dataThreeSource){
        return new JdbcTemplate(dataThreeSource) ;
    }

    /**
     * Shard-JDBC 分库配置
     */
    @Bean
    public DataSource dataSource (@Autowired DruidDataSource dataOneSource,
                                  @Autowired DruidDataSource dataTwoSource,
                                  @Autowired DruidDataSource dataThreeSource) throws Exception {
        ShardingRuleConfiguration shardJdbcConfig = new ShardingRuleConfiguration();
        shardJdbcConfig.getTableRuleConfigs().add(getTableRule01());
        shardJdbcConfig.getTableRuleConfigs().add(getTableRule02());
        shardJdbcConfig.setDefaultDataSourceName("ds_0");
        Map<String,DataSource> dataMap = new LinkedHashMap<>() ;
        dataMap.put("ds_0",dataOneSource) ;
        dataMap.put("ds_2",dataTwoSource) ;
        dataMap.put("ds_3",dataThreeSource) ;
        Properties prop = new Properties();
        return ShardingDataSourceFactory.createDataSource(dataMap, shardJdbcConfig, new HashMap<>(), prop);
    }

    /**
     * Shard-JDBC 分表配置
     */
    private static TableRuleConfiguration getTableRule01() {
        TableRuleConfiguration result = new TableRuleConfiguration();
        result.setLogicTable("table_one");
        result.setActualDataNodes("ds_${2..3}.table_one_${1..5}");
        result.setDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("phone", new DataSourceAlg()));
        result.setTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("phone", new TableOneAlg()));
        return result;
    }
    private static TableRuleConfiguration getTableRule02() {
        TableRuleConfiguration result = new TableRuleConfiguration();
        result.setLogicTable("table_two");
        result.setActualDataNodes("ds_${2..3}.table_two_${1..5}");
        result.setDatabaseShardingStrategyConfig(new StandardShardingStrategyConfiguration("phone", new DataSourceAlg()));
        result.setTableShardingStrategyConfig(new StandardShardingStrategyConfiguration("phone", new TableTwoAlg()));
        return result;
    }
}
