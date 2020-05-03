package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Email;
import com.whw.springboot.entity.Reporter;
import com.whw.springboot.mapper.EmailMapper;
import com.whw.springboot.mapper.ReporterMapper;
import com.whw.springboot.service.ReporterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.List;

@Service
public class ReporterServiceImpl implements ReporterService {

    @Autowired
    private ReporterMapper reporterMapper;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailMapper emailMapper;

    @Override
    public Boolean insertReporter(Reporter reporter) throws MessagingException {


        MimeMessage mimeMessage = mailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
        Email email = new Email();
        email.setEmailId(reporter.getReporterEmailId());
        Email email1 =  emailMapper.queryEmail(email);
        helper.setFrom("1243563796@qq.com");
        helper.setTo(email1.getEmailName());
        helper.setSubject(reporter.getReporterTitle());
        helper.setText(reporter.getReporterText());


        if(reporter.getReporterPic()!=null){
            String []img = reporter.getReporterPic().split(";");
            int len = img.length;
            System.out.println(len);
            System.out.println(img[0]);
            FileSystemResource fileSystemResource = new FileSystemResource(new File(img[0]));
            if(len>1)
            {
                for (int i=1;i<len;i++)
                {
                    System.out.println(img[i]);
                    helper.addAttachment(String.valueOf(img[i]),fileSystemResource);
                }
            }

        }
        mailSender.send(mimeMessage);




        return reporterMapper.insertReporter(reporter);




    }

    @Override
    public List<Reporter> queryAllReporter(Reporter reporter) {
        return reporterMapper.queryAllReporter(reporter);
    }



    @Override
    public int deleteById(Integer reporterId) {
        return reporterMapper.deleteById(reporterId);
    }

    @Override
    public int updataReporter(Reporter reporter) {
        return reporterMapper.updataReporter(reporter);
    }
}
