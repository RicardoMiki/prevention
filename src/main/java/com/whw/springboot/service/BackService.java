package com.whw.springboot.service;

import com.whw.springboot.entity.Back;
import com.whw.springboot.entity.BackNumber;

import java.util.List;

public interface BackService {
    int deleteByPrimaryKey(Integer backId);

    int insert(Back record);

    Back insertSelective(Back record);

    List<Back> selectByPrimaryKey(BackNumber backNumber);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}
