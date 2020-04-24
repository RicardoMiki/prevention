package com.whw.springboot.controller;

import com.whw.springboot.entity.Setting;
import com.whw.springboot.service.SettingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 11379
 *
 */
//设置跨域
@CrossOrigin(origins = { "http://localhost:8080", "null" })

//swagger配置
@Api(description = "Setting接口")
@RestController
public class SettingController {
    @Autowired
    private SettingService settingService;

    @ApiOperation(value = "添加 所需的")
    @PostMapping(value = "Setting")
    public int insertSetting(Setting setting) {


        return settingService.insertSelective(setting);
    }

    @ApiOperation(value = "删除 id")
    @DeleteMapping(value = "Setting/{Setting_id}")
    public int deleteSetting(@PathVariable("Setting_id") Integer setting_id) {
        return settingService.deleteByPrimaryKey(setting_id);
    }

    @ApiOperation(value = "修改 所需属性")
    @PutMapping(value = "Setting")
    public int updataSetting(Setting setting) {

        return settingService.updateByPrimaryKeySelective(setting);
    }

    @ApiOperation(value = "查看 传入所需条件 不传就是返回全部")
    @GetMapping(value = "Setting/{setting_id}")
    public Setting querySettings(@PathVariable("setting_id") Integer setting_id) {

        Setting setting= settingService.selectByPrimaryKey(setting_id);


        if (setting.getSettingPic() != null) {
            List<String> pic = Arrays.asList(setting.getSettingPic().split(";"));
            setting.setPic(pic);
        }


        return setting;
    }
}
