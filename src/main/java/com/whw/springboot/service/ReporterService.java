package com.whw.springboot.service;

import com.whw.springboot.entity.Reporter;

import javax.mail.MessagingException;
import java.util.List;

public interface ReporterService {

    Boolean insertReporter(Reporter reporter) throws MessagingException;

    List<Reporter> queryAllReporter(Reporter reporter);

    public void sendAttachmentsMail(Reporter reporter);

    int deleteById(Integer reporterId);

    int updataReporter(Reporter reporter);
}
