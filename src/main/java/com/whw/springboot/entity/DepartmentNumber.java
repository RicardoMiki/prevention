package com.whw.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DepartmentNumber {
    private Integer dep_id;
    private String dep_leader_id;
}
