package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Duty;
import com.whw.springboot.mapper.DutyMapper;
import com.whw.springboot.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyServiceImpl implements DutyService {

    @Autowired
    private DutyMapper dutyMapper;

    @Override
    public int deleteByPrimaryKey(Integer dutyId) {
        return dutyMapper.deleteByPrimaryKey(dutyId);
    }

    @Override
    public int insert(Duty record) {
        return dutyMapper.insert(record);
    }

    @Override
    public int insertSelective(Duty record) {
        return dutyMapper.insertSelective(record);
    }

    @Override
    public Duty selectByPrimaryKey(Integer dutyId) {
        return dutyMapper.selectByPrimaryKey(dutyId);
    }

    @Override
    public int updateByPrimaryKeySelective(Duty record) {
        return dutyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Duty record) {
        return dutyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Duty> selectAllDuty(Duty record) {
        return dutyMapper.selectAllDuty(record);
    }
}
