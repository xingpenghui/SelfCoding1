package com.feri.common.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 *@Author feri
 *@Date Created in 2019/1/21 15:28
 */
public class DateUtil {
    //
    public static String getTime(){
       return getTime("yyyy-MM-dd HH:mm:ss");
    }
    public static String getTime(String format){
        return new SimpleDateFormat(format).format(new Date());

    }
    //
    public static Date getTime(int type,int num){
        Calendar calendar=Calendar.getInstance();
        calendar.add(type,num);
        return calendar.getTime();
    }
    //
    public static LocalDateTime parse(Date date){
        ZoneId zoneId=ZoneId.systemDefault();
        return LocalDateTime.ofInstant(date.toInstant(),zoneId);
    }


}
