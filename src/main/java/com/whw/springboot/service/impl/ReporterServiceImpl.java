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
            return reporterMapper.insertReporter(reporter);
    }

    @Override
    public List<Reporter> queryAllReporter(Reporter reporter) {
        return reporterMapper.queryAllReporter(reporter);
    }

    @Override
    public void sendAttachmentsMail(Reporter reporter) {
        MimeMessage message=mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper=new MimeMessageHelper(message,true);
            Email email = new Email();
            email.setEmailId(reporter.getReporterEmailId());
            Email email1 =  emailMapper.queryEmail(email);
            helper.setFrom("1243563796@qq.com");
            helper.setTo(email1.getEmailName());
            helper.setSubject(reporter.getReporterTitle());
            helper.setText(reporter.getReporterText());
            //String filePath =
            if(null != reporter.getReporterPic()){
                String []img = reporter.getReporterPic().split(";");
                if (null != img)
                {
                    //传单张图片
                    // file=new FileSystemResource(new File(filePath));
                    //String fileName=filePath.substring(filePath.lastIndexOf(File.separator));
                    //System.out.println(fileName);
                    //helper.addAttachment(fileName,file);
                    FileSystemResource file = null;
                    for (int i = 0; i < img.length;i++)
                    {
                        file = new FileSystemResource(img[i]);
                        helper.addAttachment(img[i].substring(img[i].lastIndexOf(File.separator)),file);
                    }
                }
            }



            mailSender.send(message);
            System.out.println("带附件的邮件发送成功");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("发送带附件的邮件失败");
        }



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
