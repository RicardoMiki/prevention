package com.whw.springboot.controller;

import com.whw.springboot.entity.Notice;
import com.whw.springboot.entity.NoticeNumber;
import com.whw.springboot.service.NoticeService;
import com.whw.springboot.utils.LoadUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })
//swagger配置
@Api(description = "Notice接口")
//接口返回json数据，声明该类是Controller
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @ApiOperation(value = "添加notice，传入需要的参数即可,图片可以多传")
    @PostMapping(value = "notice", headers = "content-type=multipart/form-data")
    public int insertNotice(Notice notice){

        Date date=new Date();
        notice.setNoticeDate(date);
        return noticeService.insertSelective(notice);
    }

    @ApiOperation(value = "删除notice，传入需要的参数即可")
    @DeleteMapping(value = "notice/{notice_id}")
    public int deleteNotice(@PathVariable("notice_id") Integer notice_id) {
        return noticeService.deleteByPrimaryKey(notice_id);
    }

    @ApiOperation(value = "修改notice，传入需要的参数即可,图片修改功能未开放")
    @PutMapping(value="notice")
    public int updataNotice(Notice notice) {
        return noticeService.updateByPrimaryKeySelective(notice);
    }

    @ApiOperation(value = "查询notice，传入需要的参数即可,图片的key是id值")
    @GetMapping(value="notice")
    public List<Notice> queryNotice(NoticeNumber noticeNumber){

        List<Notice> notices= noticeService.selectByPrimaryKey(noticeNumber);
        for (Notice notice : notices) {

            if(notice.getNoticePic()!=null) {
                String[] img=notice.getNoticePic().split(";");
                notice.setImgs(img);
            }

        }


        return notices;
    }
}
