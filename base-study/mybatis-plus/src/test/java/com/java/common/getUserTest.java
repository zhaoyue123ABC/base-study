package com.java.common;

import com.java.common.entity.User;
import com.java.common.mapper.UserMapper;
import com.java.common.service.DataTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class getUserTest {
    private static final Logger logger = LoggerFactory.getLogger(DataTest.class);

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUser(){
        logger.info(" --- 开始取值 --- ");
        //参数是一个Wrapper，条件结构器，这里先不用 填null
        //查询所有的用户
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
