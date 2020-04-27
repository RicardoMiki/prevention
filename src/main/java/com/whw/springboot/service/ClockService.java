package com.whw.springboot.service;

import com.whw.springboot.entity.Clock;
import com.whw.springboot.entity.ClockNumber;

import java.util.List;

public interface ClockService {
    int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByPrimaryKey(ClockNumber clockNumber);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}


