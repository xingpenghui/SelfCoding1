package com.feri.common.util;

/**
 *@Author feri
 *@Date Created in 2019/1/21 15:31
 */
public class StringUtil {
    //空返回true 不空返回false
    public static boolean isEmpty(String... vls){
        for(String v:vls){
            if(v!=null && v.length()>0){
                return false;
            }
        }
        return true;
    }
}
