package com.java.common.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.EmptyWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.java.common.entity.Dome;
import com.java.common.mapper.DomeMapper;
import com.java.common.service.DomeService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class DomeServiceImpl extends ServiceImpl<DomeMapper, Dome> implements DomeService {


    @Override
    public Dome selectData(String title) {
        QueryWrapper<Dome> domeWrapper = new QueryWrapper<>();
        domeWrapper.eq("title", title);
        Dome dome = baseMapper.selectOne(domeWrapper);
        return dome;
    }

    @Override
    public int insertData(Dome dome) {
        String str = String.valueOf(new Date().getTime());
        int domeId = Integer.valueOf(str.substring(5,str.length()));
        dome.setDomeId(domeId);
        int result = baseMapper.insert(dome);
        return result;
    }

    @Override
    public int updateData(Dome dome) {
        UpdateWrapper<Dome> domeWrapper = new UpdateWrapper<>();
        domeWrapper.eq("title", dome.getTitle());
        int result = baseMapper.update(dome,domeWrapper);
        return result;
    }
}
