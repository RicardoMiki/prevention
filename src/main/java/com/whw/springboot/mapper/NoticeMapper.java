package com.whw.springboot.mapper;

import com.whw.springboot.entity.Notice;
import com.whw.springboot.entity.NoticeNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByPrimaryKey(NoticeNumber noticeNumber);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}
