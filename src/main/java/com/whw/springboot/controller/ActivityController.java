package com.whw.springboot.controller;

import com.whw.springboot.entity.Activity;
import com.whw.springboot.entity.Article;
import com.whw.springboot.service.ActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置.
@Api(description = "Activity接口")
@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    /**
     * int insertActivity(Activity activity);
     *
     *     int deleteActivity(int activityId);
     *
     *     int updateActivity(Activity activity);
     *
     *     List<Activity> selectActivity(Activity activity);
     *
     */

    /**
     * 添加活动
     *
     */
    @ApiOperation(value = "添加活动")
    @PostMapping(value = "insertActivity")
    public int insertActivity(Activity activity) {
        return activityService.insertActivity(activity);
    }

    /**
     * 修改活动
     */
    @ApiOperation(value = "修改活动")
    @PutMapping(value = "updateActivity")
    public int updateActivity(Activity activity){
        return activityService.updateActivity(activity);
    }

    /**
     * 删除活动
     */
    @ApiOperation(value = "删除活动")
    @DeleteMapping(value = "deleteActivity")
    public int deleteActivity(int activityId){
        return activityService.deleteActivity(activityId);
    }

    /**
     * 查看所有活动
     */
    @ApiOperation(value = "查看所有活动")
    @GetMapping(value = "queryActivity")
    public List<Activity> selectActivity(Activity activity){
        return activityService.selectActivity(activity);
    }

}
