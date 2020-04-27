package com.whw.springboot.service;

import com.whw.springboot.entity.Dormitory;
import com.whw.springboot.entity.DormitoryNumber;

import java.util.List;

public interface DormitoryService {
    int deleteByPrimaryKey(Integer dormitoryId);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);

    List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber);

    int updateByPrimaryKeySelective(Dormitory record);

    int updateByPrimaryKey(Dormitory record);
}
