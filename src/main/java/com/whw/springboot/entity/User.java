package com.whw.springboot.entity;

import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "com-whw-springboot-entity-User")
@Data
@NoArgsConstructor
public class User {
    /**
     * 用户学号
     */
    @ApiModelProperty(value = "用户学号")
    private String userId;

    /**
     * 微信的openid
     */
    @ApiModelProperty(value = "微信的openid")
    private String userOpenId;

    /**
     * 用户密码
     */
    @ApiModelProperty(value = "用户密码")
    private String userPwd;

    /**
     * 用户身份证号后四位
     */
    @ApiModelProperty(value = "用户身份证号后四位")
    private String userIdCard4;

    /**
     * 是否为医生 0不是 1是
     */
    @ApiModelProperty(value = "是否为医生 0不是 1是")
    private Integer userDoc;

    @IgnoreSwaggerParameter
    private Userinfo userinfo;
}
