package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Activity;
import com.whw.springboot.mapper.ActivityMapper;
import com.whw.springboot.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public int insertActivity(Activity activity) {
        return activityMapper.insertActivity(activity);
    }

    @Override
    public int deleteActivity(int activityId) {
        return activityMapper.deleteActivity(activityId);
    }

    @Override
    public int updateActivity(Activity activity) {
        return activityMapper.updateActivity(activity);
    }

    @Override
    public List<Activity> selectActivity(Activity activity) {
        return activityMapper.selectActivity(activity);
    }
}
