package com.whw.springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GlobalConfig {
    /**
     * 全局资源文件保存地址
     */
    @Value("${file-path}")
    public String globalFilePath;


    /**
     * 网址host
     */
    @Value("${hostUrl}")
    public String hostUrl;
}
