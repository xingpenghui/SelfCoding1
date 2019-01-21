package com.qfedu.websockteserver;

import org.java_websocket.WebSocketImpl;

/**
 *@Author feri
 *@Date Created in 2019/1/18 15:04
 */
public class My_Main {
    public static void main(String[] args) {
        WebSocketImpl.DEBUG=false;
        WsServer wsServer=new WsServer(7676);
        wsServer.start();


    }
}
