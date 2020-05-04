package com.whw.springboot.controller;

import com.whw.springboot.entity.Clazz;
import com.whw.springboot.entity.ClazzNumber;
import com.whw.springboot.service.ClazzService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Clazz接口")
@RestController
public class ClazzController {
    @Autowired
    private ClazzService clazzService;
    @ApiOperation(value = "添加 所需的")
    @PostMapping(value = "clazz")
    public int insertClazz(Clazz clazz) {
        return clazzService.insertSelective(clazz);
    }
    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "clazz/{clazz_id}")
    public int deleteClazz(@PathVariable("clazz_id") Integer clazz_id) {
        return clazzService.deleteByPrimaryKey(clazz_id);
    }
    @ApiOperation(value = "修改 所需属性")
    @PutMapping(value = "clazz")
    public int updataClazz(Clazz clazz) {
        return clazzService.updateByPrimaryKeySelective(clazz);
    }
    @ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
    @GetMapping(value = "clazz")
    public List<Clazz> queryClazzs(ClazzNumber clazzNumber) {
        return clazzService.selectByPrimaryKey(clazzNumber);
    }
}

