package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Leave;
import com.whw.springboot.entity.LeaveNumber;
import com.whw.springboot.mapper.LeaveMapper;
import com.whw.springboot.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveServiceImpl implements LeaveService {

    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public int deleteByPrimaryKey(Integer leaveId) {
        // TODO Auto-generated method stub
        return leaveMapper.deleteByPrimaryKey(leaveId);
    }

    @Override
    public int insertSelective(Leave record) {
        // TODO Auto-generated method stub
        return leaveMapper.insertSelective(record);
    }

    @Override
    public List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber) {
        // TODO Auto-generated method stub
        return leaveMapper.selectByPrimaryKey(leaveNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Leave record) {
        // TODO Auto-generated method stub
        return leaveMapper.updateByPrimaryKeySelective(record);
    }
}
