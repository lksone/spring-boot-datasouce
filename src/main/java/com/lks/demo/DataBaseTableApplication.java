package com.lks.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.lks.demo.mapper")
public class DataBaseTableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DataBaseTableApplication.class, args);
    }
}
