package com.java.common;

import com.alibaba.fastjson.JSONObject;
import com.java.common.entity.Dome;
import com.java.common.service.DomeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class test {

    @Autowired
    DomeService domeService;

    @Test
    public void getInsert(){
        Dome dome = new Dome();
        dome.setTitle("标题3");
        dome.setContent("内容3");
        dome.setType("分类3");
        int num = domeService.insertData(dome);
        System.out.println(" = = = 运行结果 ： " + num + " = = = ");
    }

    @Test
    public void getSelect(){
        String title = "标题2";
        Dome dome = domeService.selectData(title);
        String result = JSONObject.toJSONString(dome);
        System.out.println(" = = = 运行结果 ： " + result + " = = = ");
    }

    @Test
    public void getUpdate(){
        Dome dome = new Dome();
        dome.setDomeId(2);
        dome.setTitle("标题1");
        dome.setContent("内容2");
        dome.setType("分类2");
        int num = domeService.updateData(dome);
        System.out.println(" = = = 运行结果 ： " + num + " = = = ");
    }

    @Test
    public void getTime(){
        long num = new Date().getTime();
        String resutlt = String.valueOf(num).substring(5,String.valueOf(num).length());
        System.out.println(resutlt);
    }

}
