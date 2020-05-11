package com.whw.springboot.mapper;

import com.whw.springboot.entity.Duty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DutyMapper {
    int deleteByPrimaryKey(Integer dutyId);

    int insert(Duty record);

    int insertSelective(Duty record);

    Duty selectByPrimaryKey(Integer dutyId);

    int updateByPrimaryKeySelective(Duty record);

    int updateByPrimaryKey(Duty record);

    List<Duty> selectAllDuty(Duty record);
}