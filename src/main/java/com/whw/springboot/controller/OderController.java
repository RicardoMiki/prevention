package com.whw.springboot.controller;

import com.whw.springboot.entity.Oder;
import com.whw.springboot.service.OderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Order接口")
//接口返回json数据，声明该类是Controller
@RestController
public class OderController {

    //依赖注入
    @Autowired
    private OderService oderService;



    /**
     * 添加订单(orderid返回值永远为0)
     */
    @ApiOperation(value = "添加订单(orderid返回值永远为0)")
    @PostMapping(value = "insertOrder")
    public Oder insertOrder(Oder oder){
        oderService.insertOrder(oder);
        return oder;
    }

    /**
     * 查看全部订单传入需要的值
     */
    @ApiOperation(value = "查看全部订单传入需要的值")
    @GetMapping(value = "queryOrder")
    public List<Oder> queryAllOrder(Oder oder){
        return oderService.queryAllOrder(oder);
    }

    /**
     * 删除订单
     */
    @ApiOperation(value = "删除订单")
    @DeleteMapping(value = "deleteOrder/{orderId}")
    public Integer deleteOderById(@PathVariable("orderId") Integer orderId){
        return oderService.deleteOderById(orderId);
    }

    /**
     * 修改订单
     */
    @ApiOperation(value = "修改订单")
    @PutMapping(value = "updateOrder")
    public Integer updateOrder(Oder oder){
        return oderService.updateOrder(oder);
    }

}