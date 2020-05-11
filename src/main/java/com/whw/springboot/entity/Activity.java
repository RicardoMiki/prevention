package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-whw-springboot-entity-Activity")
@Data
public class Activity {
    /**
    * 活动id
    */
    @ApiModelProperty(value="活动id")
    private Integer activityId;

    /**
    * 活动名称
    */
    @ApiModelProperty(value="活动名称")
    private String activityName;

    /**
    * 活动地点
    */
    @ApiModelProperty(value="活动地点")
    private String activityLocation;

    /**
    * 活动开始时间
    */
    @ApiModelProperty(value="活动开始时间")
    private String activityStartTime;

    /**
    * 活动结束时间
    */
    @ApiModelProperty(value="活动结束时间")
    private String activityEndTime;

    /**
    * 长期活动开始时间
    */
    @ApiModelProperty(value="长期活动开始时间")
    private String activityLongStartTime;

    /**
    * 长期活动结束时间
    */
    @ApiModelProperty(value="长期活动结束时间")
    private String activityLongEndTime;

    /**
    * 活动限制人数
    */
    @ApiModelProperty(value="活动限制人数")
    private Integer activityLimit;

    /**
    * 活动状态 0：未上架 1：上架 2：下架 3：报名人数已满
    */
    @ApiModelProperty(value="活动状态 0：未上架 1：上架 2：下架 3：报名人数已满")
    private Integer activityStatus;

    /**
    * 活动类型0：长期活动 1：限时活动
    */
    @ApiModelProperty(value="活动类型0：长期活动 1：限时活动")
    private Integer activityType;

    /**
    * 活动描述
    */
    @ApiModelProperty(value="活动描述")
    private String activityText;

    /**
    * 活动封面图片
    */
    @ApiModelProperty(value="活动封面图片")
    private String activityPic;
}