package com.whw.springboot.controller;

import com.whw.springboot.entity.Department;
import com.whw.springboot.entity.DepartmentNumber;
import com.whw.springboot.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Department接口")
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @ApiOperation(value = "添加 所需属性")
    @PostMapping(value = "Department")
    public int insertDepartment(Department department) {
        return departmentService.insertSelective(department);
    }
    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "Department/{dep_id}")
    public int deleteDepartment(@PathVariable("dep_id") Integer dep_id) {
        return departmentService.deleteByPrimaryKey(dep_id);
    }
    @ApiOperation(value = "图片和 文章分别传送，图片必填，文章填写所需部分")
    @PutMapping(value = "Department")
    public int updataDepartment(Department department) {
        return departmentService.updateByPrimaryKeySelective(department);
    }
    @ApiOperation(value = "查询 所需条件 不填则全部")
    @GetMapping(value = "Department")
    public List<Department> queryDepartments(DepartmentNumber departmentNumber) {
        return departmentService.selectByPrimaryKey(departmentNumber);
    }
}
