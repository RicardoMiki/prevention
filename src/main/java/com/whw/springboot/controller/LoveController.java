package com.whw.springboot.controller;

import com.whw.springboot.entity.Love;
import com.whw.springboot.service.LoveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Love接口")
//接口返回json数据，声明该类是Controller
@RestController
public class LoveController {

    @Autowired
    private LoveService loveService;

    @ApiOperation(value = "添加 所需的")
    @PostMapping(value = "Love")
    public int insertLove(Love love) {
        return loveService.insert(love);
    }
    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "Love")
    public int deleteLove(Love love) {
        return loveService.deleteLove(love);
    }

    @ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
    @GetMapping(value = "Love")
    public List<Love> queryLoves(Love love) {
        return loveService.queryLove(love);
    }
}
