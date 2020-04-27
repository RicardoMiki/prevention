package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Love;
import com.whw.springboot.mapper.LoveMapper;
import com.whw.springboot.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoveServiceImpl implements LoveService {

    @Autowired
    private LoveMapper loveMapper;

    @Override
    public int insert(Love record) {
        // TODO Auto-generated method stub
        return loveMapper.insert(record);
    }

    @Override
    public int deleteLove(Love love) {
        // TODO Auto-generated method stub
        return loveMapper.deleteLove(love);
    }

    @Override
    public List<Love> queryLove(Love love) {
        // TODO Auto-generated method stub
        return loveMapper.queryLove(love);
    }

}
