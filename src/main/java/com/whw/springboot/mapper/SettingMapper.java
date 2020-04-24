package com.whw.springboot.mapper;

import com.whw.springboot.entity.Setting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SettingMapper {

    int deleteByPrimaryKey(Integer settingId);

    int insert(Setting record);

    int insertSelective(Setting record);

    Setting selectByPrimaryKey(Integer settingId);

    int updateByPrimaryKeySelective(Setting record);

    int updateByPrimaryKey(Setting record);
}
