package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Oder;
import com.whw.springboot.mapper.OderMapper;
import com.whw.springboot.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OderServiceImpl implements OderService {

    @Autowired
    private OderMapper oderMapper;

    @Override
    public Boolean insertOrder(Oder oder) {
        return oderMapper.insertOrder(oder);
    }

    @Override
    public List<Oder> queryAllOrder(Oder oder) {
        return oderMapper.queryAllOrder(oder);
    }

    @Override
    public Integer deleteOderById(Integer orderId) {
        return oderMapper.deleteOderById(orderId);
    }

    @Override
    public Integer updateOrder(Oder oder) {
        return oderMapper.updateOrder(oder);
    }
}
