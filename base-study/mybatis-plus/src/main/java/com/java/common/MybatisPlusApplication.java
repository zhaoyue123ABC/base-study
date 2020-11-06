package com.java.common;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.java.common.mapper")
public class MybatisPlusApplication {
    private static final Logger logger = LoggerFactory.getLogger(MybatisPlusApplication.class);

    public static void main(String[] args) {
        logger.info(" --- 运行MybatisPlusApplication服务 --- ");
        SpringApplication.run(MybatisPlusApplication.class,args);
        logger.info(" --- MybatisPlusApplication运行完成 --- ");
    }
}
