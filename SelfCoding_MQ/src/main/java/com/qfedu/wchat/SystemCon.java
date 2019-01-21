package com.qfedu.wchat;

import org.java_websocket.WebSocket;

import java.util.*;

/**
 *@Author feri
 *@Date Created in 2019/1/18 16:19
 */
public class SystemCon {
    public static int ID=1;
    public static List<WebSocket> users;
    public static List<WebSocket> emps;
    public static WebSocket kf;
    public static Map<WebSocket,WebSocket> refs;//键记录客服  值记录用户
    static {
        users=new ArrayList<>();
        emps=new ArrayList<>();
        refs=new LinkedHashMap<>();
    }
    //随机分配客服
    public static void randomKf(WebSocket webSocket){
        kf=emps.get(new Random().nextInt(emps.size()));
        refs.put(kf,webSocket);//分配客服
    }
}
