package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Reporter;
import com.whw.springboot.mapper.ReporterMapper;
import com.whw.springboot.service.ReporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporterServiceImpl implements ReporterService {

    @Autowired
    private ReporterMapper reporterMapper;

    @Override
    public Boolean insertReporter(Reporter reporter) {
        return reporterMapper.insertReporter(reporter);
    }

    @Override
    public List<Reporter> queryAllReporter(Reporter reporter) {
        return reporterMapper.queryAllReporter(reporter);
    }



    @Override
    public int deleteById(Integer reporterId) {
        return reporterMapper.deleteById(reporterId);
    }

    @Override
    public int updataReporter(Reporter reporter) {
        return reporterMapper.updataReporter(reporter);
    }
}
