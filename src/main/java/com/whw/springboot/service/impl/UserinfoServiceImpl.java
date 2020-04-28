package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.mapper.UserinfoMapper;
import com.whw.springboot.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public int updataUserinfo(Userinfo userinfo) {
        return userinfoMapper.updataUserinfo(userinfo);
    }

    @Override
    public Userinfo queryUserinfoById(String user_id) {
        return userinfoMapper.queryUserinfoById(user_id);
    }

    @Override
    public List<Userinfo> queryUserinfo() {
        return userinfoMapper.queryUserinfo();
    }

    @Override
    public int insertUserinfo(Userinfo userinfo) {
        return userinfoMapper.insertUserinfo(userinfo);
    }
}
