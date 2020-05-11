package com.whw.springboot.controller;


import com.whw.springboot.entity.Duty;
import com.whw.springboot.service.DutyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置.
@Api(description = "Duty接口")
@RestController
public class DutyController {
    @Autowired
    private DutyService dutyService;

    /**
     * int deleteByPrimaryKey(Integer dutyId);
     *
     *     int insert(Duty record);
     *
     *     int insertSelective(Duty record);
     *
     *     Duty selectByPrimaryKey(Integer dutyId);
     *
     *     int updateByPrimaryKeySelective(Duty record);
     *
     *     int updateByPrimaryKey(Duty record);
     *
     *     List<Duty> selectAllDuty(Duty record);
     */

    /**
     * 添加值班
     *
     */
    @ApiOperation(value = "添加值班")
    @PostMapping(value = "insertDuty")
    public int insertSelective(Duty record) throws ParseException {
        if (record.getDutyTimeString()!=null){
            Date date = new Date();
            SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
            date = formatter.parse(record.getDutyTimeString());
            record.setDutyTime(date);
        }




        return dutyService.insertSelective(record);
    }

    /**
     * 修改值班
     */
    @ApiOperation(value = "修改值班")
    @PutMapping(value = "updateDuty")
    public  int updateByPrimaryKeySelective(Duty record) throws ParseException {
        if (record.getDutyTimeString()!=null){
            Date date = new Date();
            SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
            date = formatter.parse(record.getDutyTimeString());
            record.setDutyTime(date);
        }
        return dutyService.updateByPrimaryKeySelective(record);
    }

    /**
     * 删除值班
     */
    @ApiOperation(value = "删除值班")
    @DeleteMapping(value = "deleteDuty")
    public int deleteByPrimaryKey(Integer dutyId){
        return dutyService.deleteByPrimaryKey(dutyId);
    }

    /**
     * 查看所有值班
     */
    @ApiOperation(value = "查看所有值班")
    @GetMapping(value = "queryDuty")
    public List<Duty> selectAllDuty(Duty record) throws ParseException {
        if (record.getDutyTimeString()!=null){
            Date date = new Date();
            SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
            date = formatter.parse(record.getDutyTimeString());
            record.setDutyTime(date);
        }
        return dutyService.selectAllDuty(record);
    }


}
