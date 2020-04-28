package com.whw.springboot.controller;

import com.whw.springboot.entity.Leave;
import com.whw.springboot.entity.LeaveNumber;
import com.whw.springboot.service.LeaveService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Leave接口")
//接口返回json数据，声明该类是Controller
@RestController
public class LeaveController {
    @Autowired
    private LeaveService leaveService;
    @ApiOperation(value = "添加 所需的")
    @PostMapping(value = "Leave" )
    public int insertLeave(Leave leave) throws ParseException {
        Date date=new Date();
        leave.setLeavePostDate(date);
        Date date2=null;
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
        date2=formatter.parse(leave.getLeaveEndDateString());
        leave.setLeaveEndDate(date2);
        date2=formatter.parse(leave.getLeaveStartDateString());
        leave.setLeaveStartDate(date2);
        return leaveService.insertSelective(leave);
    }
    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "Leave/{Leave_id}")
    public int deleteLeave(@PathVariable("Leave_id") Integer Leave_id) {
        return leaveService.deleteByPrimaryKey(Leave_id);
    }
    @ApiOperation(value = "修改 所需属性")
    @PutMapping(value = "Leave")
    public int updataLeave(Leave leave) {
        return leaveService.updateByPrimaryKeySelective(leave);
    }
    @ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
    @GetMapping(value = "Leave")
    public List<Leave> queryLeaves(LeaveNumber leaveNumber) {
        return leaveService.selectByPrimaryKey(leaveNumber);
    }
}
