package com.whw.springboot.controller;

import com.whw.springboot.entity.Clinic;
import com.whw.springboot.service.ClinicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = " Clinic接口")
//接口返回json数据，声明该类是Controller
@RestController
public class ClinicController {

    @Autowired
    private ClinicService clinicService;

    /**
     * int insertClinic(Clinic clinic);
     *
     *     List<Clinic> queryClinicById(Clinic clinic);
     *
     *     int deleteClinicById(Clinic clinic);
     *
     *     int updateClinicById(Clinic clinic);
     */

    @ApiOperation(value = "添加 Clinic")
    @PostMapping(value = "insertClinic" )
    public int insertClinic(Clinic clinic){
        return clinicService.insertClinic(clinic);
    }

    @ApiOperation(value = "查看 Clinic")
    @GetMapping(value = "queryClinic" )
    public List<Clinic> queryClinicById(Clinic clinic){
        return clinicService.queryClinicById(clinic);
    }

    @ApiOperation(value = "修改Clinic")
    @PutMapping(value = "updateClinic")
    public int updateClinicById(Clinic clinic){
        return clinicService.updateClinicById(clinic);
    }

    @ApiOperation( value = "删除Clinic")
    @DeleteMapping(value = "deleteClinic")
    public int deleteClinicById(Clinic clinic){
        return clinicService.deleteClinicById(clinic);
    }
}
