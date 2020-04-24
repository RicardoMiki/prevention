package com.whw.springboot.service;

import com.whw.springboot.entity.User;
import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.entity.UserNumber;

import java.util.List;



public interface UserService {

	Boolean insertUser(UserNumber userNumber);

	User CheckUserById(UserNumber userNumber);

	Userinfo CheckRegister(UserNumber userNumber);

	int changePwd(String user_id,String user_pwd);
}