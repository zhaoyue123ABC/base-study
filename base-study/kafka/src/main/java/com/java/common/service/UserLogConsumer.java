package com.java.common.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserLogConsumer {
    private static final Logger logger = LoggerFactory.getLogger(UserLogConsumer.class);

    @KafkaListener(topics = {"user-log"})
    public void consumer(ConsumerRecord<?,?> consumerRecord){
        //判断是否为null
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        logger.info(">>>>>>>>>> record = " + kafkaMessage);
        if(kafkaMessage.isPresent()){
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            logger.info("消费消息:"+message);
        }
    }

}
