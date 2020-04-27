package com.whw.springboot.mapper;

import com.whw.springboot.entity.Department;
import com.whw.springboot.entity.DepartmentNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer depId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByPrimaryKey(DepartmentNumber departmentNumber);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}
