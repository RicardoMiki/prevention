package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-whw-springboot-entity-Email")
@Data
@NoArgsConstructor
public class Email {
    /**
     * 邮箱id
     */
    @ApiModelProperty(value = "邮箱id")
    private int emailId;

    /**
     * 邮箱号
     */
    @ApiModelProperty(value = "邮箱号")
    private String emailName;
}
