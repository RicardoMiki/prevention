package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Department;
import com.whw.springboot.entity.DepartmentNumber;
import com.whw.springboot.mapper.DepartmentMapper;
import com.whw.springboot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int deleteByPrimaryKey(Integer depId) {
        // TODO Auto-generated method stub
        return departmentMapper.deleteByPrimaryKey(depId);
    }

    @Override
    public int insert(Department record) {
        // TODO Auto-generated method stub
        return departmentMapper.insert(record);
    }

    @Override
    public int insertSelective(Department record) {
        // TODO Auto-generated method stub
        return departmentMapper.insertSelective(record);
    }

    @Override
    public List<Department> selectByPrimaryKey(DepartmentNumber departmentNumber) {
        // TODO Auto-generated method stub
        return departmentMapper.selectByPrimaryKey(departmentNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Department record) {
        // TODO Auto-generated method stub
        return departmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Department record) {
        // TODO Auto-generated method stub
        return departmentMapper.updateByPrimaryKey(record);
    }
}
