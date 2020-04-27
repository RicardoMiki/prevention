package com.whw.springboot.entity;

import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-whw-springboot-entity-Doctor")
@Data
@NoArgsConstructor
public class Doctor {
    /**
     * 医生id
     */
    @ApiModelProperty(value = "医生id")
    private String docId;

    /**
     * 医生姓名
     */
    @ApiModelProperty(value = "医生姓名")
    private String docName;

    /**
     * 医生类别 1：心理咨询室 2：医务室
     */
    @ApiModelProperty(value = "医生类别 1：心理咨询室 2：医务室")
    private Integer docType;

    /**
     * 医务室id
     */
    @ApiModelProperty(value = "医务室id")
    private Integer docClinicId;

    @IgnoreSwaggerParameter
    private Clinic clinic;
    /**
     * 医生电话
     */
    @ApiModelProperty(value = "医生电话")
    private String docPhone;

    /**
     * 医生身份证号
     */
    @ApiModelProperty(value = "医生身份证号")
    private String docIdCard;
}
