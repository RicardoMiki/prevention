package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Notice;
import com.whw.springboot.entity.NoticeNumber;
import com.whw.springboot.mapper.NoticeMapper;
import com.whw.springboot.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticMapper;


    @Override
    public int deleteByPrimaryKey(Integer noticeId) {
        // TODO Auto-generated method stub
        return noticMapper.deleteByPrimaryKey(noticeId);
    }

    @Override
    public int insert(Notice record) {
        // TODO Auto-generated method stub
        return noticMapper.insert(record);
    }

    @Override
    public int insertSelective(Notice record) {
        // TODO Auto-generated method stub
        return noticMapper.insertSelective(record);
    }

    @Override
    public List<Notice> selectByPrimaryKey(NoticeNumber noticeNumber) {
        // TODO Auto-generated method stub
        return noticMapper.selectByPrimaryKey(noticeNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Notice record) {
        // TODO Auto-generated method stub
        return noticMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Notice record) {
        // TODO Auto-generated method stub
        return noticMapper.insertSelective(record);
    }
}
