package com.whw.springboot.service;

import com.whw.springboot.entity.Oder;

import java.util.Date;
import java.util.List;

public interface OderService {

    Boolean insertOrder(Oder oder);

    List<Oder> queryAllOrder(Oder oder);

    Integer deleteOderById(Integer orderId);

    Integer updateOrder(Oder oder);

    List<Oder> queryFiveOrder(Date date1, Date date2);
}
