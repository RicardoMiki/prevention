package com.whw.springboot.controller;

import com.whw.springboot.entity.Reporter;
import com.whw.springboot.service.ReporterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Reporter接口")
//接口返回json数据，声明该类是Controller
@RestController
public class ReporterController {

    //依赖注入ReporterService

    @Autowired
    private ReporterService reporterService;

    /**
     * 添加上报(reporterid返回值永远为0)
     */
    @ApiOperation(value = "添加上报(reporterid返回值永远为0)")
    @PostMapping(value = "reporter")
    public Reporter insertReporter(Reporter reporter){
        reporterService.insertReporter(reporter);
        return reporter;
    }

    /**
     * 查看全部上报传入需要的值
     */
    @ApiOperation(value = "查看全部上报传入需要的值")
    @GetMapping(value = "query")
    public List<Reporter> queryAllReporter(Reporter reporter){
        return reporterService.queryAllReporter(reporter);
    }

    /**
     * 删除某条上报
     */
    @ApiOperation(value = "删除某条上报")
    @DeleteMapping(value = "delete/{reporterId}")
    public int deleteById(@PathVariable("reporterId") Integer reporterId){
        return reporterService.deleteById(reporterId);
    }

    /**
     * 修改上报
     */
    @ApiOperation(value = "修改上报")
    @PutMapping(value = "updata")
    public int updataReporter( Reporter reporter){
        return reporterService.updataReporter(reporter);
    }



}
