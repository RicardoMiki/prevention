package com.whw.springboot.service;

import com.whw.springboot.entity.Userinfo;

import java.util.List;

public interface UserinfoService{
    int updataUserinfo(Userinfo userinfo);

    Userinfo queryUserinfoById(String user_id);

    List<Userinfo> queryUserinfo();

    int insertUserinfo(Userinfo userinfo);
}

