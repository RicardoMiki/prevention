package com.whw.springboot.service;

import com.whw.springboot.entity.Duty;

import java.util.List;

public interface DutyService {
    int deleteByPrimaryKey(Integer dutyId);

    int insert(Duty record);

    int insertSelective(Duty record);

    Duty selectByPrimaryKey(Integer dutyId);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);

    List<Duty> selectAllDuty(Duty record);
}
