package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-whw-springboot-entity-Setting")
@Data
public class Setting {
    /**
     * 设置编号
     */
    @ApiModelProperty(value = "设置编号")
    private Integer settingId;

    /**
     * 学校名称
     */
    @ApiModelProperty(value = "学校名称")
    private String settingSchoolName;

    /**
     * 首页轮播图
     */
    @ApiModelProperty(value = "首页轮播图")
    private String settingPic;
}