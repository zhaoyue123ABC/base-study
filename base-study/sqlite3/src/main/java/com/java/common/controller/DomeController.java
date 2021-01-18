package com.java.common.controller;

import com.alibaba.fastjson.JSONObject;
import com.java.common.entity.Dome;
import com.java.common.service.DomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DomeController {
    private static final Logger logger = LoggerFactory.getLogger(DomeController.class);

    @Autowired
    DomeService domeService;

    @RequestMapping("/select")
    @ResponseBody
    public String getSelect(@RequestParam("title")String title){
        Dome dome = new Dome();
        logger.info(" = = = title : {} = = = ",title);
        if(title != null){
            dome = domeService.selectData(title);
            if(dome != null){
                String json = JSONObject.toJSONString(dome);
                logger.info(" = = = json : {} = = = ",json);
                return json;
            }
        }
        return "主题字段为空！";
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String getInsert(@RequestBody Dome dome){
        int result = 0;
        logger.info(" = = = dome : {} = = = ", JSONObject.toJSONString(dome));
        if(dome != null) {
            result = domeService.insertData(dome);
            logger.info(" = = = result : {} = = = ", result);
        }
        if(result > 0){
            return "添加成功！！";
        }
        return "添加失败！！";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String getUpdate(@RequestBody Dome dome){
        int result = 0;
        logger.info(" = = = dome : {} = = = ", JSONObject.toJSONString(dome));
        if(dome != null){
            result = domeService.updateData(dome);
            logger.info(" = = = result : {} = = = ", result);
        }
        if(result > 0){
            return "修改成功！！";
        }
        return "修改失败！！";
    }
}
