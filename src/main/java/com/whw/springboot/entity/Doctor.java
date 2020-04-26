package com.whw.springboot.entity;

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
     * 医生密码
     */
    @ApiModelProperty(value = "医生密码")
    private String docPwd;

    /**
     * 医生类别 1：心理咨询室 2：医务室
     */
    @ApiModelProperty(value = "医生类别 1：心理咨询室 2：医务室")
    private Integer docType;

    /**
     * 医务室id
     */
    @ApiModelProperty(value = "医务室id")
    private String docClinicId;

}
