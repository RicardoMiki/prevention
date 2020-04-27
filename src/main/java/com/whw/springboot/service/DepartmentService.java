package com.whw.springboot.service;

import com.whw.springboot.entity.Department;
import com.whw.springboot.entity.DepartmentNumber;

import java.util.List;

public interface DepartmentService {
    int deleteByPrimaryKey(Integer depId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByPrimaryKey(DepartmentNumber departmentNumber);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}
