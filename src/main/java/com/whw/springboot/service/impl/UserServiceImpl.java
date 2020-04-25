package com.whw.springboot.service.impl;

import java.util.List;

import com.whw.springboot.entity.User;
import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.entity.UserNumber;
import com.whw.springboot.mapper.UserMapper;
import com.whw.springboot.mapper.UserinfoMapper;
import com.whw.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

	// 依赖注入UserMapper
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserinfoMapper userinfoMapper;

	@Override
	public Boolean insertUser(UserNumber userNumber) {
		return userMapper.insertUser(userNumber);
	}

	@Override
	public User CheckUserById(UserNumber userNumber) {
		return userMapper.CheckUserById(userNumber);
	}

	@Override
	public Userinfo CheckRegister(UserNumber userNumber) {
		return userinfoMapper.CheckRegister(userNumber);
	}

	@Override
	public int changePwd(String user_id, String user_pwd) {
		return userMapper.changePwd(user_id,user_pwd);
	}


}