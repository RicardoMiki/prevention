package com.whw.springboot.mapper;

import com.whw.springboot.entity.Doctor;
import com.whw.springboot.entity.UserNumber;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorMapper {
    int updataDoctor(Doctor doctor);
    Doctor queryDoctorById(Doctor doctor);
    Doctor CheckRegisterDoctor(UserNumber userNumber);
}
