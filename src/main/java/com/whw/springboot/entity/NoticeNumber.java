package com.whw.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NoticeNumber {
    private Integer notice_id;
    private String notice_part;
    private Integer notice_state;
    private Integer user_admin_id;
}
