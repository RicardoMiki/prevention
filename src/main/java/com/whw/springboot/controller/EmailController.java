package com.whw.springboot.controller;

import com.whw.springboot.entity.Email;
import com.whw.springboot.service.EmailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = " Email接口")
//接口返回json数据，声明该类是Controller
@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    /**
     * int insertEmail(Email email);
     *
     *     List<Email> queryEmailById(String emailid);
     *
     *     int deleteEmailById(String email_id);
     *
     *     int updateEmailById(Email email);
     */
    @ApiOperation(value = "添加 Email")
    @PostMapping(value = "Email" )
    public int insertEmail(Email email){
        return emailService.insertEmail(email);
    }

    @ApiOperation(value = "查看 Email")
    @GetMapping(value = "queryEmail" )
    public List<Email> queryEmailById(Email email){
        return emailService.queryEmailById(email);
    }

    @ApiOperation(value = "修改email")
    @PutMapping(value = "updateEmail")
    public int updateEmailById(Email email){
        return  emailService.updateEmailById(email);
    }

    @ApiOperation( value = "删除email")
    @DeleteMapping(value = "deleteEmail")
    public int deleteEmailById(Email email){
        return emailService.deleteEmailById(email);
    }

}
