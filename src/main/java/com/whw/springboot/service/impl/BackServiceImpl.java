package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Back;
import com.whw.springboot.entity.BackNumber;
import com.whw.springboot.mapper.BackMapper;
import com.whw.springboot.service.BackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackServiceImpl implements BackService {

    @Autowired
    private BackMapper backMapper;

    @Override
    public int deleteByPrimaryKey(Integer backId) {
        // TODO Auto-generated method stub
        return backMapper.deleteByPrimaryKey(backId);
    }

    @Override
    public int insert(Back record) {
        // TODO Auto-generated method stub
        return backMapper.insert(record);
    }

    @Override
    public int insertSelective(Back record) {
        // TODO Auto-generated method stub

        return backMapper.insertSelective(record);
    }

    @Override
    public List<Back> selectByPrimaryKey(BackNumber backNumber) {
        // TODO Auto-generated method stub
        return backMapper.selectByPrimaryKey(backNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Back record) {
        // TODO Auto-generated method stub
        return backMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Back record) {
        // TODO Auto-generated method stub
        return backMapper.updateByPrimaryKey(record);
    }

}