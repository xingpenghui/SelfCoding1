package com.feri.common.test;

import com.feri.common.util.HttpUtil;

import java.io.File;
import java.io.IOException;

/**
 *@Author feri
 *@Date Created in 2019/1/24 10:46
 */
public class Http_Test {
    public static void main(String[] args) throws IOException {
//        System.out.println(HttpUtil.getResStr(HttpUtil.GET,"http://www.baidu.com"));
        System.out.println(HttpUtil.downLoad("https://mvnrepository.com/assets/images/392dffac024b9632664e6f2c0cac6fe5-logo.png",null,new File("abc.png")));

    }
}
