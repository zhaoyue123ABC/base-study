package com.java.common;

import com.java.common.service.UserLogProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class KafkaApplication {
    private static final Logger logger = LoggerFactory.getLogger(KafkaApplication.class);

    @Autowired
    private UserLogProducer kafkaSender;
    @PostConstruct
    public void init(){
        for (int i = 0; i < 10; i++) {
            //调用消息发送类中的消息发送方法
            kafkaSender.sendLog(String.valueOf(i));
        }
    }

    public static void main(String[] args) {
        logger.info(" --- 运行KafkaApplication服务 --- ");
        SpringApplication.run(KafkaApplication.class,args);
        logger.info(" --- KafkaApplication运行成功 --- ");
    }

}
