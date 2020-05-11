package com.whw.springboot.mapper;

import com.whw.springboot.entity.Activity;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface ActivityMapper {
    int insertActivity(Activity activity);

    int deleteActivity(int activityId);

    int updateActivity(Activity activity);

    List<Activity> selectActivity(Activity activity);
}
