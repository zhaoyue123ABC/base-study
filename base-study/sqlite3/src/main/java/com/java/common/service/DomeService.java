package com.java.common.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.common.entity.Dome;

public interface DomeService extends IService<Dome> {

    //查询
    Dome selectData(String title);

    //添加
    int insertData(Dome dome);

    //修改
    int updateData(Dome dome);

}
