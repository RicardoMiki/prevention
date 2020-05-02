package com.whw.springboot.service.impl;

import com.whw.springboot.entity.Oder;
import com.whw.springboot.entity.OderTime;
import com.whw.springboot.mapper.OderMapper;
import com.whw.springboot.service.OderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class OderServiceImpl implements OderService {

    @Autowired
    private OderMapper oderMapper;

    @Override
    public Boolean insertOrder(Oder oder) {
        return oderMapper.insertOrder(oder);
    }

    @Override

    public List<Oder> queryAllOrder(Oder oder) {
        return oderMapper.queryAllOrder(oder);
    }

    @Override
    public Integer deleteOderById(Integer orderId) {
        return oderMapper.deleteOderById(orderId);
    }

    @Override
    public Integer updateOrder(Oder oder) {
        return oderMapper.updateOrder(oder);
    }

    @Override
    public List<List<OderTime>> queryFiveOrder(Date date) {

        List<List<OderTime>> lists =new ArrayList<>();

        for (int k = 0; k < 7; k++) {



            List<OderTime> list1 =new ArrayList<OderTime>();

            for (int i=8;i <= 20; i++) {
                date.setHours(i);
                System.out.println("data:"+date);
                System.out.println("hours"+date.getHours());
                OderTime queryFiveOrder = oderMapper.queryFiveOrder(date);
                if (queryFiveOrder==null) {
                    Date date2 = (Date) date.clone();
                    OderTime oderTime = new OderTime();
                    oderTime.setOrderDate(date2);
                    list1.add(oderTime);
                }else {
                    list1.add(queryFiveOrder);
                }


            }

            lists.add(list1);
            Calendar   calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(calendar.DATE,1); //把日期往后增加一天,整数  往后推,负数往前移动
            date=calendar.getTime(); //这个时间就是日期往后推一天的结果
        }


        return lists;
    }
}
