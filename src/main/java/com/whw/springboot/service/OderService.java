package com.whw.springboot.service;

import com.whw.springboot.entity.Oder;
import com.whw.springboot.entity.OderTime;

import java.util.Date;
import java.util.List;

public interface OderService {

    Boolean insertOrder(Oder oder);

    List<Oder> queryAllOrder(Oder oder);

    Integer deleteOderById(Integer orderId);

    Integer updateOrder(Oder oder);

    List<List<OderTime>> queryFiveOrder(Date date, String orderType);
}
