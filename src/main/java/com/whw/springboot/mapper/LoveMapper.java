package com.whw.springboot.mapper;

import com.whw.springboot.entity.Love;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoveMapper {

    int insert(Love record);

    int deleteLove(Love love);

    List<Love> queryLove(Love love);
}
