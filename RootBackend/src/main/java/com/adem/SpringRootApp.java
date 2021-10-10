package com.adem;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.util.Date;
import java.util.Objects;
import java.util.TimeZone;
// extends SpringBootServletInitializer
@SpringBootApplication
@Slf4j
public class SpringRootApp  {
    private static String DCE_CONFIG_HOME = "DCE_CONFIG_HOME";
    private static String DCE_CONFIG_FILE_NAME = "application.yml";
    private static String TIME_ZONE_ID = "TIME_ZONE_ID";
    static String configFile = String.format("%s%s%s", System.getProperty(DCE_CONFIG_HOME), File.separator, DCE_CONFIG_FILE_NAME);

     static {
        if (new File(configFile).exists()) {
            // Update default spring configuration file location.
            System.setProperty("spring.config.location", configFile);
            log.info(String.format("Using configuration file :%s", System.getProperty("spring.config.location")));

            /*try {
                ClassLoader classLoader = SpringRootApp.class.getClassLoader();
                InputStream is = classLoader.getResourceAsStream("application.yml");
                System.getProperties().load(is);
            } catch (IOException e) {
                log.error("Expected Configuration file solution.properties not found in resources folder!!", e);
            }*/
        } else {
            log.info(String.format("Expected Configuration file :%s not found!!", System.getProperty("spring.config.location")));
            System.exit(-1);
        }

        /*if (Objects.nonNull(System.getProperty(TIME_ZONE_ID))) {
            log.info(String.format("TimeZone manually changed from system property. TimeZoneId :%s", System.getProperty(TIME_ZONE_ID)));
            log.info("Current System Date : " + new Date());
            TimeZone.setDefault(TimeZone.getTimeZone(System.getProperty(TIME_ZONE_ID)));
            log.info("Changed System Date : " + new Date());
        }*/
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRootApp.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(SpringRootApp.class);
    }*/
}
