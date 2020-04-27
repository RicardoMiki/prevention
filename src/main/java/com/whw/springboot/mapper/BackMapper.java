package com.whw.springboot.mapper;

import com.whw.springboot.entity.Back;
import com.whw.springboot.entity.BackNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BackMapper {
    int deleteByPrimaryKey(Integer backId);

    int insert(Back record);

    Back insertSelective(Back record);

    List<Back> selectByPrimaryKey(BackNumber backNumber);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKey(Back record);
}
