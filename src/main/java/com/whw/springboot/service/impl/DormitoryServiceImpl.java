package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Dormitory;
import com.whw.springboot.entity.DormitoryNumber;
import com.whw.springboot.mapper.DormitoryMapper;
import com.whw.springboot.service.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {

    @Autowired
    private DormitoryMapper dormitoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer dormitoryId) {
        // TODO Auto-generated method stub
        return dormitoryMapper.deleteByPrimaryKey(dormitoryId);
    }

    @Override
    public int insert(Dormitory record) {
        // TODO Auto-generated method stub
        return dormitoryMapper.insert(record);
    }

    @Override
    public int insertSelective(Dormitory record) {
        // TODO Auto-generated method stub
        return dormitoryMapper.insertSelective(record);
    }

    @Override
    public List<Dormitory> selectByPrimaryKey(DormitoryNumber dormitoryNumber) {

        return dormitoryMapper.selectByPrimaryKey(dormitoryNumber);
    }

    @Override
    public int updateByPrimaryKeySelective(Dormitory record) {
        // TODO Auto-generated method stub
        return dormitoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dormitory record) {
        // TODO Auto-generated method stub
        return dormitoryMapper.updateByPrimaryKey(record);
    }
}
