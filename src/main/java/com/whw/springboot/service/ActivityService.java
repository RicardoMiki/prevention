package com.whw.springboot.service;

import com.whw.springboot.entity.Activity;

import java.util.List;

public interface ActivityService {
    int insertActivity(Activity activity);

    int deleteActivity(int activityId);

    int updateActivity(Activity activity);

    List<Activity> selectActivity(Activity activity);


}
