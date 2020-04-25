package com.whw.springboot.mapper;


import com.whw.springboot.entity.User;
import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.entity.UserNumber;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


	Boolean insertUser(UserNumber userNumber);

	User CheckUserById(UserNumber userNumber);



	int changePwd(String user_id,String user_pwd);

}