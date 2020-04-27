package com.whw.springboot.service;

import com.whw.springboot.entity.Clinic;

import java.util.List;

public interface ClinicService {
    int insertClinic(Clinic clinic);

    List<Clinic> queryClinicById(Clinic clinic);

    int deleteClinicById(Clinic clinic);

    int updateClinicById(Clinic clinic);
}
