package cn.jzteam.barber.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConfigurationProperties("datasource")
public class DatasourceConfig {

    private String jdbcUrl;

    /**
     * 数据加载后输出到日志进行检查。
     */
    @PostConstruct
    private void selfShow() {

    }
}
