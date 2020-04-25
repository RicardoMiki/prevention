package com.whw.springboot.controller;

import java.io.IOException;


import com.whw.springboot.entity.User;
import com.whw.springboot.entity.Userinfo;
import com.whw.springboot.entity.UserNumber;
import com.whw.springboot.service.UserService;
import com.whw.springboot.utils.OpenId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "User接口")
//接口返回json数据，声明该类是Controller
@RestController
public class UserController {

	// 依赖注入UserService

	@Autowired
	private UserService userService;

	/**
	 * 注册用户.
	 */
	@ApiOperation(value = "注册用户需要学号")
	@PostMapping(value = "user")
	public Userinfo insertUser(UserNumber userNumber) {
		Userinfo userinfo = userService.CheckRegister(userNumber);
		if (userinfo != null)
			if (userService.insertUser(userNumber)){
				return userinfo;
			}
		return null;

	}

	@ApiOperation(value = "账户登入，管理端登入输入账号密码即可，微信小程序输入openid即可")
	@GetMapping(value = "login")
	@ResponseBody
	public User loginUser(UserNumber userNumber) {

		return userService.CheckUserById(userNumber);
	}

	@ApiOperation(value="输入小程序端自动生成的code 返回对应的openid")
	@GetMapping(value="openid" )
	public String getOpenId(String code) throws IOException {
		return OpenId.userLogin(code);
	}

	/**
	 * 修改密码
	 *
	 */
	@ApiOperation(value = "修改密码")
	@PutMapping(value = "update")
	@ResponseBody
	public int changePwd(String user_id,String user_pwd){
		return userService.changePwd(user_id,user_pwd);
	}
}