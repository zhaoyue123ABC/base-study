package com.java.common.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.java.common.entity.User;
import com.java.common.mapper.UserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DataTest {
    private static final Logger logger = LoggerFactory.getLogger(DataTest.class);

    @Autowired
    private UserMapper userMapper;

    public void getUser(){
        logger.info(" --- 开始取值 --- ");
        //参数是一个Wrapper，条件结构器，这里先不用 填null
        //查询所有的用户
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        //条件构造器 - - - 查询
        User user = new User();
        Wrapper<User> wrapper=new EntityWrapper<>(user);
        wrapper.eq("age",user.getAge());
        userMapper.selectList(wrapper).forEach(age -> System.out.println(age));

        //条件构造器 - - - 修改
        User user1 = new User("小红");
        Wrapper<User> wrapper1 = new EntityWrapper<>();
        wrapper1.eq("username","小明");
        userMapper.update(user1,wrapper1).toString();

        //条件构造器 - - - 删除
        User user2 = new User("小红");
        Wrapper<User> wrapper2 = new EntityWrapper<>();
        wrapper2.eq("username",user2.getUsername());
        userMapper.delete(wrapper2).toString();
    }
}
