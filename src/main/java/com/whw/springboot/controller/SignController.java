package com.whw.springboot.controller;

import com.whw.springboot.entity.Sign;
import com.whw.springboot.service.SignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置.
@Api(description = "Sign接口")
@RestController
public class SignController {

    @Autowired
    private SignService signService;

    /**
     * int deleteByPrimaryKey(Integer signId);
     *
     *     int insert(Sign record);
     *
     *     int insertSelective(Sign record);
     *
     *     Sign selectByPrimaryKey(Integer signId);
     *
     *     int updateByPrimaryKeySelective(Sign record);
     *
     *     int updateByPrimaryKey(Sign record);
     *
     *     List<Sign> selectAllSign(Sign sign);
     */

    /**
     * 删除报名
     */
    @ApiOperation(value = "删除报名")
    @DeleteMapping(value = "deleteSign")
    public int deleteByPrimaryKey(Integer signId){
        return signService.deleteByPrimaryKey(signId);
    }

    /**
     * 修改报名
     */
    @ApiOperation(value = "修改报名")
    @PutMapping(value = "updateSign")
    public int updateByPrimaryKeySelective(Sign record){
        return signService.updateByPrimaryKeySelective(record);
    }

    /**
     * 增加报名
     */
    @ApiOperation(value = "增加报名")
    @PostMapping(value = "insertSign")
    public int insertSelective(Sign record){
        return signService.insertSelective(record);
    }

    /**
     * 查看所有报名
     */
    @ApiOperation(value = "查看所有报名")
    @GetMapping(value = "queryAllSign")
    public List<Sign> selectAllSign(Sign sign){
        return signService.selectAllSign(sign);
    }
}
