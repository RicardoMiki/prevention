package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Sign;
import com.whw.springboot.mapper.SignMapper;
import com.whw.springboot.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignMapper signMapper;

    @Override
    public int deleteByPrimaryKey(Integer signId) {
        return signMapper.deleteByPrimaryKey(signId);
    }

    @Override
    public int insert(Sign record) {
        return signMapper.insert(record);
    }

    @Override
    public int insertSelective(Sign record) {
        return signMapper.insertSelective(record);
    }

    @Override
    public Sign selectByPrimaryKey(Integer signId) {
        return signMapper.selectByPrimaryKey(signId);
    }

    @Override
    public int updateByPrimaryKeySelective(Sign record) {
        return signMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Sign record) {
        return signMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Sign> selectAllSign(Sign record) {
        return signMapper.selectAllSign(record);
    }
}
