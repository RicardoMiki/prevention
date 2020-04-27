package com.whw.springboot.controller;

import com.whw.springboot.entity.Dormitory;
import com.whw.springboot.entity.DormitoryNumber;
import com.whw.springboot.service.DormitoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Dormitory接口")
@RestController
public class DormitoryController {
    @Autowired
    private DormitoryService dormitoryService;

    @ApiOperation(value = "添加 所需的")
    @PostMapping(value = "Dormitory")
    public int insertDormitory(Dormitory dormitory) {
        return dormitoryService.insertSelective(dormitory);
    }

    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "Dormitory/{Dormitory_id}")
    public int deleteDormitory(@PathVariable("Dormitory_id") Integer Dormitory_id) {
        return dormitoryService.deleteByPrimaryKey(Dormitory_id);
    }

    @ApiOperation(value = "修改 所需属性")
    @PutMapping(value = "Dormitory")
    public int updataDormitory(Dormitory dormitory) {
        return dormitoryService.updateByPrimaryKeySelective(dormitory);
    }

    @ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
    @GetMapping(value = "Dormitory")
    public List<Dormitory> queryDormitorys(DormitoryNumber dormitoryNumber) {
        return dormitoryService.selectByPrimaryKey(dormitoryNumber);
    }
    @ApiOperation(value = "查看楼号和房间号 传入所需条件 不传就是返回全部")
    @GetMapping(value = "DormitoryList")
    public Map<String, Object> queryDormitorysSet(DormitoryNumber dormitoryNumber) {
        Map<String , Object> map =new HashMap<String, Object>();

        List<Dormitory> selectByPrimaryKey = dormitoryService.selectByPrimaryKey(dormitoryNumber);

        Set<String> buildId=new HashSet<>();
        Set<String> houseId=new HashSet<>();
        for (Dormitory item : selectByPrimaryKey) {
            buildId.add(item.getDormitoryBuildId());
            houseId.add(item.getDormitoryHouseId());
        }
        map.put("buildId", buildId);
        map.put("houseId", houseId);
        return map;
    }
}
