package com.whw.springboot.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value="com-whw-springboot-entity-Dormitory")
@Data
@NoArgsConstructor
public class Dormitory {
    /**
     * 宿舍id
     */
    @ApiModelProperty(value = "宿舍id")
    private Integer dormitoryId;

    /**
     * 宿舍楼号
     */
    @ApiModelProperty(value = "宿舍楼号")
    private String dormitoryBuildId;

    /**
     * 宿舍编号
     */
    @ApiModelProperty(value = "宿舍编号")
    private String dormitoryHouseId;

    /**
     * 宿管姓名
     */
    @ApiModelProperty(value = "宿管姓名")
    private String dormitoryManagerName;

    /**
     * 宿管电话
     */
    @ApiModelProperty(value = "宿管电话")
    private String dormitoryManagerPhone;
}
