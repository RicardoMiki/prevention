package com.whw.springboot.mapper;

import com.whw.springboot.entity.UserNumber;
import com.whw.springboot.entity.Userinfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserinfoMapper {
    int updataUserinfo(Userinfo userinfo);
    Userinfo queryUserinfoById(String user_id);
    Userinfo CheckRegister(UserNumber userNumber);
}
