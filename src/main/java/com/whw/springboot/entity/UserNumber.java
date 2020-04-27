package com.whw.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserNumber {
    private String user_id;
    private String user_openid;
    private String user_pwd;
    private String user_idcard4;
    private Integer user_doc;

}
