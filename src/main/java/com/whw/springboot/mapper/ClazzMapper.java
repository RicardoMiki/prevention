package com.whw.springboot.mapper;

import com.whw.springboot.entity.Clazz;
import com.whw.springboot.entity.ClazzNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClazzMapper {
    int deleteByPrimaryKey(Integer clazzId);

    int insert(Clazz record);

    int insertSelective(Clazz record);

    List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber);

    int updateByPrimaryKeySelective(Clazz record);

    int updateByPrimaryKey(Clazz record);
}
