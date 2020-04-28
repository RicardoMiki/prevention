package com.whw.springboot.entity;

import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel(value = "com-whw-springboot-entity-Userinfo")
@Data
@NoArgsConstructor
public class Userinfo {
    /**
     * 用户学号
     */
    @ApiModelProperty(value = "用户学号")
    private String userId;



    /**
     * 所属学部id
     */
    @ApiModelProperty(value = "所属学部id")
    private Integer depId;
    @IgnoreSwaggerParameter
    private Department department;

    /**
     * 班级id
     */
    @ApiModelProperty(value = "班级id")
    private Integer classId;

    @IgnoreSwaggerParameter
    private Clazz clazz;
    /**
     * 宿舍id
     */
    @ApiModelProperty(value = "宿舍id")
    private Integer dormitoryId;
    @IgnoreSwaggerParameter
    private Dormitory dormitory;

    /**
     * 0：学生 1：专业老师  2：辅导员 3：学部主任 4：学管负责人 5：校长 6.管理员
     */
    @ApiModelProperty(value = "0：学生 1：专业老师  2：辅导员 3：学部主任 4：学管负责人 5：校长 6.管理员")
    private Integer userType;



    /**
     * 用户姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String userName;



    /**
     * 用户手机号
     */
    @ApiModelProperty(value = "用户手机号")
    private String userPhone;

    /**
     * 用户身份证号
     */
    @ApiModelProperty(value = "用户身份证号")
    private String userIdCard;



    @IgnoreSwaggerParameter
    private List<Love> loves;


}
