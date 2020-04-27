package com.whw.springboot.service;

import com.whw.springboot.entity.Leave;
import com.whw.springboot.entity.LeaveNumber;

import java.util.List;

public interface LeaveService {
    int deleteByPrimaryKey(Integer leaveId);

    int insertSelective(Leave record);

    List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber);

    int updateByPrimaryKeySelective(Leave record);

}
