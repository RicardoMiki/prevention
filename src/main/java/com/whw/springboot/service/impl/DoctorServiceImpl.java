package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Doctor;
import com.whw.springboot.entity.UserNumber;
import com.whw.springboot.mapper.DoctorMapper;
import com.whw.springboot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public int updataDoctor(Doctor doctor) {
        return doctorMapper.updataDoctor(doctor);
    }

    @Override
    public Doctor queryDoctorById(Doctor doctor) {
        return doctorMapper.queryDoctorById(doctor);
    }

    @Override
    public Doctor CheckRegisterDoctor(UserNumber userNumber) {
        return doctorMapper.CheckRegisterDoctor(userNumber);
    }
}
