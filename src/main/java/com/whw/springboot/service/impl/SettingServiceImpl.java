package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Setting;
import com.whw.springboot.mapper.SettingMapper;
import com.whw.springboot.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingServiceImpl implements SettingService {
    @Autowired
    private SettingMapper settingMapper;


    @Override
    public int deleteByPrimaryKey(Integer settingId) {
        // TODO Auto-generated method stub
        return settingMapper.deleteByPrimaryKey(settingId);
    }

    @Override
    public int insert(Setting record) {
        // TODO Auto-generated method stub
        return settingMapper.insert(record);
    }

    @Override
    public int insertSelective(Setting record) {
        // TODO Auto-generated method stub
        return settingMapper.insertSelective(record);
    }

    @Override
    public Setting selectByPrimaryKey(Integer settingId) {
        // TODO Auto-generated method stub
        return settingMapper.selectByPrimaryKey(settingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Setting record) {
        // TODO Auto-generated method stub
        return settingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Setting record) {
        // TODO Auto-generated method stub
        return settingMapper.updateByPrimaryKey(record);
    }
}
