package com.whw.springboot.mapper;

import com.whw.springboot.entity.Clinic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClinicMapper {
    int insertClinic(Clinic clinic);

    List<Clinic> queryClinicById(Clinic clinic);

    int deleteClinicById(Clinic clinic);

    int updateClinicById(Clinic clinic);
}
