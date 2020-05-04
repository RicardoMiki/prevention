package com.whw.springboot.service;

import com.whw.springboot.entity.Clazz;
import com.whw.springboot.entity.ClazzNumber;

import java.util.List;

public interface ClazzService {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}
