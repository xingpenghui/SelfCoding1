package com.qfedu.wchat;

/**
 *@Author feri
 *@Date Created in 2019/1/18 16:31
 */
public class SocketMain {
    public static void main(String[] args) {
        ChatWsServer server=new ChatWsServer(7676);
        server.start();
        System.out.println("在线客服系统运行中……");
    }
}
