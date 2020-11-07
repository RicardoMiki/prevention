package com.whw.springboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value="com-whw-springboot-entity-Order")
@Data
@NoArgsConstructor
public class Oder {
    /**
     * 就诊预约id
     */
    @ApiModelProperty(value = "就诊预约id")
    private Integer orderId;

    /**
     * 就诊预约用户id
     */
    @ApiModelProperty(value = "就诊预约用户id")
    private String orderUserId;

    /**
     * 就诊预约医生id
     */
    @ApiModelProperty(value = "就诊预约医生id")
    private String orderDocId;

    /**
     * 就诊预约时间
     */

    @ApiModelProperty(value = "就诊预约时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date orderDate;

    @ApiModelProperty(value="就诊预约时间传入这个就行")
    private String orderDateString;

    @ApiModelProperty(value="查询五天开始日期")
    private String orderStartDateString;

    @ApiModelProperty(value="查询五天结束日期")
    private String orderEndDateString;
    /**
     * 就诊咨询内容预填写
     */
    @ApiModelProperty(value = "就诊咨询内容预填写")
    private String orderContent;

    /**
     * 就诊预约提交时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "就诊预约提交时间")
    private Date orderPostTime;

    /**
     * 就诊类别 1：心理咨询室预约 2：医务室预约
     */
    @ApiModelProperty(value = "就诊类别 1：心理咨询室预约 2：医务室预约")
    private String orderType;

    /**
     * 就诊预约状态  0：预约失败 1:预约成功 2预约中 3:已过期 4：就诊完成
     */
    @ApiModelProperty(value = "就诊预约状态  0：预约失败 1:预约成功 2预约中 3:已过期 4：就诊完成")
    private String orderStatus;


    @IgnoreSwaggerParameter
    private Userinfo userinfo;

    @IgnoreSwaggerParameter
    private Doctor doctor;


}
