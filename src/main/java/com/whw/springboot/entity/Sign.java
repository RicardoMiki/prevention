package com.whw.springboot.entity;

import com.whw.springboot.config.IgnoreSwaggerParameter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-whw-springboot-entity-Sign")
@Data
public class Sign {
    /**
    * 活动报名id
    */
    @ApiModelProperty(value="活动报名id")
    private Integer signId;

    /**
    * 活动id
    */
    @ApiModelProperty(value="活动id")
    private Integer signActivityId;

    @IgnoreSwaggerParameter
    private Activity activity;

    /**
    * 报名人员id
    */
    @ApiModelProperty(value="报名人员id")
    private String signUserid;

    @IgnoreSwaggerParameter
    private Userinfo userinfo;

    /**
    * 是否有活动经验 （传入中文：是、否）
    */
    @ApiModelProperty(value="是否有活动经验 （传入中文：是、否）")
    private String signExp;

    /**
    * 报名状态：0：审核中 1：报名成功 2：报名失败
    */
    @ApiModelProperty(value="报名状态：0：审核中 1：报名成功 2：报名失败")
    private Integer signStatus;

    /**
    * 上次活动时间（有：填时间，没有：无）
    */
    @ApiModelProperty(value="上次活动时间（有：填时间，没有：无）")
    private String signDate;

    /**
    * 活动时间 
    */
    @ApiModelProperty(value="活动时间 ")
    private String signActdate;
}