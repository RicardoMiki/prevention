package com.whw.springboot.controller;

import com.whw.springboot.entity.Doctor;
import com.whw.springboot.service.DoctorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Doctor接口")
@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;



    /**
     * 查询医生输入需要信息
     */
    @ApiModelProperty(value = "查询医生输入需要信息")
    @GetMapping( value = "queryDoctor")
    public Doctor queryDoctorById(Doctor doctor){
        return doctorService.queryDoctorById(doctor);
    }

    /**
     * 修改医生信息
     */
    @ApiModelProperty(value = "修改医生信息")
    @PutMapping(value = "updateDoctor")
    public int updataDoctor(Doctor doctor){
        return doctorService.updataDoctor(doctor);
    }
}
