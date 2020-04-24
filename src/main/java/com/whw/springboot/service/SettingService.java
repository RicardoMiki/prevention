package com.whw.springboot.service;

import com.whw.springboot.entity.Setting;

public interface SettingService {
    int deleteByPrimaryKey(Integer settingId);

    int insert(Setting record);

    int insertSelective(Setting record);

    Setting selectByPrimaryKey(Integer settingId);

    int updateByPrimaryKeySelective(Setting record);

    int updateByPrimaryKey(Setting record);
}
