package cc.mrbird;

import cc.mrbird.common.properties.FebsProperies;
import cc.mrbird.security.properties.FebsSecurityProperties;
import cc.mrbird.security.social.SocialWebAutoConfiguration;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
@MapperScan({"cc.mrbird.*.dao"})
@EnableConfigurationProperties({FebsSecurityProperties.class, FebsProperies.class})
@EnableCaching
@EnableAsync
@EnableTransactionManagement
public class FebsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FebsApplication.class, args);
        LoggerFactory.getLogger(FebsApplication.class).info(
                "《《《《《《 FEBS started up successfully at {} {} 》》》》》》", LocalDate.now(), LocalTime.now());
    }
}
