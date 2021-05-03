package com.lks.demo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class DataBaseTableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataBaseTableApplication.class, args);
        log.info("项目启动成功" + "\\n");
    }
}
