package com.whw.springboot.controller;

import com.whw.springboot.entity.Reporter;
import com.whw.springboot.service.ReporterService;
import com.whw.springboot.utils.LoadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Reporter接口")
//接口返回json数据，声明该类是Controller
@RestController
public class ReporterController {

    //依赖注入ReporterService

    @Autowired
    private ReporterService reporterService;

    /**
     * 添加上报(reporterid返回值永远为0)
     */
    @ApiOperation(value = "添加上报(reporterid返回值永远为0)")
    @PostMapping(value = "insertReporter")
    public Reporter insertReporter(Reporter reporter) throws MessagingException {
        reporterService.sendAttachmentsMail(reporter);
        reporterService.insertReporter(reporter);
        return reporter;
    }

    /**
     * 查看全部上报传入需要的值
     */
    @ApiOperation(value = "查看全部上报传入需要的值")
    @GetMapping(value = "queryReporter")
    public List<Reporter> queryAllReporter(Reporter reporter){

        return reporterService.queryAllReporter(reporter);
    }

    /**
     * 删除某条上报
     */
    @ApiOperation(value = "删除某条上报")
    @DeleteMapping(value = "deleteReporter/{reporterId}")
    public int deleteById(@PathVariable("reporterId") Integer reporterId){
        return reporterService.deleteById(reporterId);
    }

    /**
     * 修改上报
     */
    @ApiOperation(value = "修改上报")
    @PutMapping(value = "updataReporter")
    public int updataReporter( Reporter reporter){
        return reporterService.updataReporter(reporter);
    }

    @ApiOperation(value="上传图片")
    @PostMapping(value="ReporterImages" , headers = "content-type=multipart/form-data")
    public String getImages(@RequestParam(value = "file") MultipartFile files,
                            RedirectAttributes redirectAttributes, HttpServletRequest request) {
        return LoadUtil.upload(files, request);

    }

}
