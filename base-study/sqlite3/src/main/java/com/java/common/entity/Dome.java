package com.java.common.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("dome")
public class Dome {

    //主键
    @TableId("domeId")
    private Integer domeId;

    //主题
    private String title;

    //内容
    private String content;

    //分类
    private String type;

    public Integer getDomeId() {
        return domeId;
    }

    public void setDomeId(Integer domeId) {
        this.domeId = domeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
