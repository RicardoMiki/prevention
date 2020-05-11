package com.whw.springboot.service;

import com.whw.springboot.entity.Activity;

import java.util.List;

public interface ActivityService {
    int deleteByPrimaryKey(Integer activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);

    List<Activity> selectAllActivity(Activity activity);
}
