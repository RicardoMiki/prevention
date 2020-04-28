package com.whw.springboot.controller;

import com.whw.springboot.entity.Clock;
import com.whw.springboot.entity.ClockNumber;
import com.whw.springboot.service.ClockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Clock接口")
@RestController
public class ClockController {
    @Autowired
    private ClockService clockService;
    @ApiOperation(value = "添加打卡填写所需部分")
    @PostMapping(value="Clock")
    public int insertClock(Clock clock) throws ParseException {

//		SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd");
//		bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));

        Date date = new Date();
        clock.setClockTime(date);
        return clockService.insertSelective(clock);
    }
    @ApiOperation(value = "删除 传入id")
    @DeleteMapping(value="Clock/{clock_id}")
    public int deleteClock(@PathVariable("clock_id") Integer clock_id) {
        return clockService.deleteByPrimaryKey(clock_id);
    }
    @ApiOperation(value = "修改，填写所需部分")
    @PutMapping(value="Clock")
    public int updataClock(Clock clock){
        return clockService.updateByPrimaryKeySelective(clock);
    }

    @ApiOperation(value = "查询打卡填写所需部分")
    @GetMapping(value="Clock")
    public List<Clock> queryClocks(ClockNumber clockNumber){
        return clockService.selectByPrimaryKey(clockNumber);
    }
}
