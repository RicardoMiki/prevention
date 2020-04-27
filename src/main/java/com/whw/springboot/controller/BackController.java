package com.whw.springboot.controller;

import com.whw.springboot.entity.Back;
import com.whw.springboot.entity.BackNumber;
import com.whw.springboot.service.BackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Back接口")
@RestController
public class BackController {
    @Autowired
    private BackService backService;

    @ApiOperation(value = "添加回校申请，图片必填，其他填写所需部分")
    @PostMapping(value = "Back")
    public Back insertBack(Back back) {

        Date date = new Date();

        back.setBackPostTime(date);

        return backService.insertSelective(back);
    }

    @ApiOperation(value = "删除back 传入id")
    @DeleteMapping(value = "back/{back_id}")
    public int deleteBack(@PathVariable("back_id") Integer back_id) {

        return backService.deleteByPrimaryKey(back_id);

    }

    @ApiOperation(value = "修改back 传入需要")
    @PutMapping(value = "back")
    public int updataBack(Back back) {
        return backService.updateByPrimaryKeySelective(back);
    }

    @ApiOperation(value = "获得back 传入需要")
    @GetMapping(value = "back")
    public List<Back> queryBack(BackNumber backNumber) {

        List<Back> backs = backService.selectByPrimaryKey(backNumber);
        for (Back back : backs) {

            if (back.getBackCert() != null) {
                List<String> certs = Arrays.asList(back.getBackCert().split(";"));
                back.setCerts111(certs);
            }
            if (back.getBackTrafficPic() != null) {
                System.out.println(back.getBackTraffic());
                List<String> TrafficPics = Arrays.asList(back.getBackTrafficPic().split(";"));
                back.setTrafficPics(TrafficPics);
            }

        }

        return backs;
    }

}
