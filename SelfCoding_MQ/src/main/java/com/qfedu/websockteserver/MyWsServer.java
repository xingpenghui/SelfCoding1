package com.qfedu.websockteserver;

import org.java_websocket.WebSocket;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *@Author feri
 *@Date Created in 2019/1/18 14:49
 */

public class MyWsServer {
    public static int online=0;//在线人数
    private static ConcurrentHashMap<WebSocket,String> users; //在线用户
    static {
        users=new ConcurrentHashMap<>();
    }
    //查询所有在线用户
    public static Collection<String> getUsers(){
        return users.values();
    }
    //添加用户
    public static void addUser(WebSocket webSocket,String name){
        users.put(webSocket,name);
    }
    //用户退出
    public static void exitUser(WebSocket webSocket){
        users.remove(webSocket);
    }
    //发送消息
    public static void sendMsg(WebSocket webSocket,String msg){
        webSocket.send(msg);
    }
    //发送全体消息
    public static  void sendMsgAll(String msg){
        //Lock跟synchronized互斥锁相比 ：性能高，但是必须手动开启，手动释放
        Lock lock=new ReentrantLock();
        try{
            lock.lock();
            for(WebSocket s:users.keySet()){
                s.send(msg);
            }
        }finally {
            lock.unlock();
        }
    }




}
