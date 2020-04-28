package com.whw.springboot.mapper;

import com.whw.springboot.entity.Oder;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

@Mapper
public interface OderMapper {

    Boolean insertOrder(Oder oder);

    List<Oder> queryAllOrder(Oder oder);

    Integer deleteOderById(Integer orderId);

    Integer updateOrder(Oder oder);

    List<Oder> queryFiveOrder(Date date1, Date date2);
}
