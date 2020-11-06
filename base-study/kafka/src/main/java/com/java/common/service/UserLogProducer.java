package com.java.common.service;

import com.alibaba.fastjson.JSON;
import com.java.common.entity.UserLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserLogProducer {
    private static final Logger logger = LoggerFactory.getLogger(UserLogProducer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    /**
     * 发送数据
     * @param userid
     */
    public void sendLog(String userid){
        UserLog userLog = new UserLog();
        userLog.setUsername("jhp");
        userLog.setUserid(userid);
        userLog.setState("0");
        logger.info("发送用户日志数据:"+userLog);
        kafkaTemplate.send("user-log", JSON.toJSONString(userLog));
    }

}
