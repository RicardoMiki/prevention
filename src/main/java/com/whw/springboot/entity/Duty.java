package com.whw.springboot.entity;

import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-whw-springboot-entity-Duty")
@Data
public class Duty {
    /**
    * 值班id
    */
    @ApiModelProperty(value="值班id")
    private Integer dutyId;

    /**
    * 值班人员id
    */
    @ApiModelProperty(value="值班人员id")
    private String dutyUserid;

    @IgnoreSwaggerParameter
    private Userinfo userinfo;
    /**
    * 值班时间
    */
    @ApiModelProperty(value="值班时间")
    private Date dutyTime;

    @ApiModelProperty(value = "值班时间传这个")
    private String dutyTimeString;
}