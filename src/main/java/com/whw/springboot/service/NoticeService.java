package com.whw.springboot.service;

import com.whw.springboot.entity.Notice;
import com.whw.springboot.entity.NoticeNumber;

import java.util.List;

public interface NoticeService {
    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByPrimaryKey(NoticeNumber noticeNumber);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}
