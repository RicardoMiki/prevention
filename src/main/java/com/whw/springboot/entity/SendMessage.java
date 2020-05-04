package com.whw.springboot.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SendMessage {
    @ApiModelProperty(value = "OpenID")
    private String touser;
    @ApiModelProperty(value = "模板ID")
    private String template_id;

    private Map<String, Object> data=null;
}
