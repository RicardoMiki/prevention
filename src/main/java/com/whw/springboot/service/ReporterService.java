package com.whw.springboot.service;

import com.whw.springboot.entity.Reporter;

import java.util.List;

public interface ReporterService {

    Boolean insertReporter(Reporter reporter);

    List<Reporter> queryAllReporter(Reporter reporter);



    int deleteById(Integer reporterId);

    int updataReporter(Reporter reporter);
}
