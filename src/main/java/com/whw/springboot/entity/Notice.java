package com.whw.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value="com-whw-springboot-entity-Notice")
@Data
@NoArgsConstructor
public class Notice {
    /**
     * 公告id
     */
    @ApiModelProperty(value = "公告id")
    private Integer noticeId;

    /**
     * userid 学管负责人
     */
    @ApiModelProperty(value = "userid 学管负责人")
    private Integer userId;

    @IgnoreSwaggerParameter
    private Userinfo user;
    /**
     * 公告发布部门
     */
    @ApiModelProperty(value = "公告发布部门")
    private String noticePart;

    /**
     * 公告标题
     */
    @ApiModelProperty(value = "公告标题")
    private String noticeTitle;

    /**
     * 公告副标题
     */
    @ApiModelProperty(value = "公告副标题")
    private String noticeSecTitle;

    /**
     * 公告内容
     */
    @ApiModelProperty(value = "公告内容")
    private String noticeText;

    /**
     * 公告图片
     */
    @ApiModelProperty(value = "公告图片")
    private String noticePic;

    /**
     * 公告上传日期
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "公告上传日期")
    private Date noticeDate;

    /**
     * 公告状态 0：未上架 1：上架
     */
    @ApiModelProperty(value = "公告状态 0：未上架 1：上架")
    private Integer noticeState;

    @ApiModelProperty(value="图片集")
    private String  imgs[];
}
