package com.whw.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value="com-whw-springboot-entity-Clock")
@Data
@NoArgsConstructor
public class Clock {
    /**
     * 打卡id
     */
    @ApiModelProperty(value = "打卡id")
    private Integer clockId;

    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private String userId;

    /**
     * 打卡时间编号
     */


    /**
     * 用户体温
     */
    @ApiModelProperty(value = "用户体温")
    private Double clockTemp;

    /**
     * 用户备注
     */
    @ApiModelProperty(value = "用户备注")
    private String clockRemark;

    /**
     * 打卡日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "打卡日期")
    private Date clockTime;

    @ApiModelProperty(value="打卡时间传入这个就行")
    private String clockTimeString;
    /**
     * 是否不适  0：适 1：不适
     */
    @ApiModelProperty(value = "是否不适  0：适 1：不适")
    private Integer clockState;
    @IgnoreSwaggerParameter
    private Userinfo userinfo;

    @IgnoreSwaggerParameter
    private Clazz clazz;

    @IgnoreSwaggerParameter
    private Dormitory dormitory;
}
