package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Clazz;
import com.whw.springboot.entity.ClazzNumber;
import com.whw.springboot.mapper.ClazzMapper;
import com.whw.springboot.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements ClazzService
{
    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public int deleteByPrimaryKey(Integer clazzId) {
        // TODO Auto-generated method stub
        return clazzMapper.deleteByPrimaryKey(clazzId);
    }

    @Override
    public int insert(Clazz record) {
        // TODO Auto-generated method stub
        return clazzMapper.insert(record);
    }

    @Override
    public int insertSelective(Clazz record) {
        // TODO Auto-generated method stub
        return clazzMapper.insertSelective(record);
    }

    @Override
    public List<Clazz> selectByPrimaryKey(ClazzNumber clazzNumber) {
        // TODO Auto-generated method stub
        return clazzMapper.selectByPrimaryKey(clazzNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Clazz record) {
        // TODO Auto-generated method stub
        return clazzMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Clazz record) {
        // TODO Auto-generated method stub
        return clazzMapper.updateByPrimaryKey(record);
    }
}
