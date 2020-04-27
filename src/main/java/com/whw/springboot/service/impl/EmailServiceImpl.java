package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Email;
import com.whw.springboot.mapper.EmailMapper;
import com.whw.springboot.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailMapper emailMapper;

    @Override
    public int insertEmail(Email email) {
        return emailMapper.insertEmail(email);
    }



    @Override
    public List<Email> queryEmailById(Email email) {
        return emailMapper.queryEmailById(email);
    }

    @Override
    public int deleteEmailById(Email email) {
        return emailMapper.deleteEmailById(email);
    }

    @Override
    public int updateEmailById(Email email) {
        return emailMapper.updateEmailById(email);
    }
}
