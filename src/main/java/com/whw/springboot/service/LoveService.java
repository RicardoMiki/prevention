package com.whw.springboot.service;

import com.whw.springboot.entity.Love;

import java.util.List;

public interface LoveService {
    int insert(Love record);

    int deleteLove(Love love);

    List<Love> queryLove(Love love);
}
