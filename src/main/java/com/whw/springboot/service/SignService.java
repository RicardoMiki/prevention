package com.whw.springboot.service;

import com.whw.springboot.entity.Sign;

import java.util.List;

public interface SignService {
    int deleteByPrimaryKey(Integer signId);

    int insert(Sign record);

    int insertSelective(Sign record);

    Sign selectByPrimaryKey(Integer signId);

    int updateByPrimaryKeySelective(Sign record);

    int updateByPrimaryKey(Sign record);

    List<Sign> selectAllSign(Sign record);
}
