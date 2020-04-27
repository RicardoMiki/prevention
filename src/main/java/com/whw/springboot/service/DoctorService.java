package com.whw.springboot.service;

import com.whw.springboot.entity.Doctor;
import com.whw.springboot.entity.UserNumber;

public interface DoctorService {

    int updataDoctor(Doctor doctor);

    Doctor queryDoctorById(Doctor doctor);

    Doctor CheckRegisterDoctor(UserNumber userNumber);
}
