package com.java.common.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.java.common.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//在对应的Mapper上继承基本的类baseMapper
@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {
    //所有的CRUD已经编写完成
    //不需要像以前的配置一些xml

}
