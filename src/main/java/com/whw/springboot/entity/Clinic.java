package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-whw-springboot-entity-ClazzClinic")
@Data
@NoArgsConstructor
public class Clinic {
    /**
     * 医务室id
     */
    @ApiModelProperty(value = "医务室id")
    private Integer clinicId;

    /**
     * 医务室名称
     */
    @ApiModelProperty(value = "医务室名称")
    private String clinicName;

    /**
     * 医务室类别 0：心理咨询室 1：医务室
     */
    @ApiModelProperty(value = "医务室类别 0：心理咨询室 1：医务室")
    private Integer clinicType;

    /**
     * 医务室地址
     */
    @ApiModelProperty(value = "医务室地址")
    private String clinicLocal;

    /**
     * 医务室联系方式
     */
    @ApiModelProperty(value = "医务室联系方式")
    private String clinicCall;

}
