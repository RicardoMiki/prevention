package com.whw.springboot.mapper;

import com.whw.springboot.entity.Email;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmailMapper {
    int insertEmail(Email email);

    List<Email> queryEmailById(Email email);

    int deleteEmailById(Email email);

    int updateEmailById(Email email);

    Email queryEmail(Email email);
}
