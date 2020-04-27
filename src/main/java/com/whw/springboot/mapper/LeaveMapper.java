package com.whw.springboot.mapper;

import com.whw.springboot.entity.Leave;
import com.whw.springboot.entity.LeaveNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LeaveMapper {
    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leave record);

    int insertSelective(Leave record);

    List<Leave> selectByPrimaryKey(LeaveNumber leaveNumber);

    int updateByPrimaryKeySelective(Leave record);

    int updateByPrimaryKey(Leave record);
}
