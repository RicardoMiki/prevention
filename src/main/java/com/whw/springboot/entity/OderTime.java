package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@ApiModel(value="com-whw-springboot-entity-OderTime")
@Data
@NoArgsConstructor
public class OderTime {
    @ApiModelProperty(value = "就诊预约时间")
    private Date orderDate;

    @ApiModelProperty( value = "时间戳个数")
    private Integer count;
}
