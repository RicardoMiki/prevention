package com.whw.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value = "com-whw-springboot-entity-Reporter")
@Data
@NoArgsConstructor
public class Reporter {
    /**
     *上报id
     */
    @ApiModelProperty(value = "上报id")
    private int reporterId;

    /**
     *上报学生学号
     */
    @ApiModelProperty(value = "上报学生学号")
    private String reporterStuId;

    /**
     *上报标题
     */
    @ApiModelProperty(value = "上报标题")
    private String reporterTitle;

    /**
     *上报内容
     */
    @ApiModelProperty(value = "上报内容")
    private String reporterText;

    /**
     *上报时间
     */
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "上报时间")
    private Date reporterDate;

    /**
     *上报接收邮箱id
     */
    @ApiModelProperty(value = "上报接收邮箱id")
    private int reporterEmailId;

    /**
     *回复内容
     */
    @ApiModelProperty(value = "回复内容")
    private String reporterReply;
}
