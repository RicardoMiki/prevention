package com.whw.springboot.mapper;

import com.whw.springboot.entity.Dormitory;
import com.whw.springboot.entity.DormitoryNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DormitoryMapper {
    int deleteByPrimaryKey(Integer dormitoryId);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);

    List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber);

    int updateByPrimaryKeySelective(Dormitory record);

    int updateByPrimaryKey(Dormitory record);
}
