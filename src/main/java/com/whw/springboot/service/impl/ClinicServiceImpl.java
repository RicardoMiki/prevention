package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Clinic;
import com.whw.springboot.mapper.ClinicMapper;
import com.whw.springboot.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    private ClinicMapper clinicMapper;

    @Override
    public int insertClinic(Clinic clinic) {
        return clinicMapper.insertClinic(clinic);
    }

    @Override
    public List<Clinic> queryClinicById(Clinic clinic) {
        return clinicMapper.queryClinicById(clinic);
    }

    @Override
    public int deleteClinicById(Clinic clinic) {
        return clinicMapper.deleteClinicById(clinic);
    }

    @Override
    public int updateClinicById(Clinic clinic) {
        return clinicMapper.updateClinicById(clinic);
    }
}
