package com.whw.springboot.service;

import com.whw.springboot.entity.Userinfo;

public interface UserinfoService{
    int updataUserinfo(Userinfo userinfo);

    Userinfo queryUserinfoById(String user_id);
}

