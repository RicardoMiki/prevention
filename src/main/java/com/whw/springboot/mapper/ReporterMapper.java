package com.whw.springboot.mapper;

import com.whw.springboot.entity.Reporter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReporterMapper {
    Boolean insertReporter(Reporter reporter);

    List<Reporter> queryAllReporter(Reporter reporter);

    int deleteById(Integer reporterId);

    int updataReporter(Reporter reporter);
}
