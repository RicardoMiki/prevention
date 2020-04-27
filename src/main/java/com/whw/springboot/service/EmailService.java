package com.whw.springboot.service;

import com.whw.springboot.entity.Email;

import java.util.List;

public interface EmailService {
    int insertEmail(Email email);

    List<Email> queryEmailById(Email email);

    int deleteEmailById(Email email);

    int updateEmailById(Email email);
}
