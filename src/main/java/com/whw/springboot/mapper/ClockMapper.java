package com.whw.springboot.mapper;

import com.whw.springboot.entity.Clock;
import com.whw.springboot.entity.ClockNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClockMapper {
    int deleteByPrimaryKey(Integer clockId);

    int insert(Clock record);

    int insertSelective(Clock record);

    List<Clock> selectByPrimaryKey(ClockNumber clockNumber);

    int updateByPrimaryKeySelective(Clock record);

    int updateByPrimaryKey(Clock record);
}
