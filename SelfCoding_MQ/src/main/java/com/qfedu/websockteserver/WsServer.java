package com.qfedu.websockteserver;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

/**
 *@Author feri
 *@Date Created in 2019/1/18 14:48
 */
public class WsServer extends WebSocketServer {
    public WsServer(int port) {
        super(new InetSocketAddress(port));
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        System.out.println("onOpen 打开连接");
    }

    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {
        System.out.println("onClose 打关闭连接");
    }

    @Override
    public void onMessage(WebSocket webSocket, String s) {
        System.out.println("onMessage 接收消息："+s);
        if(s.startsWith("name:")){
            MyWsServer.addUser(webSocket,s.substring(s.indexOf(":")));
        }else if(s.startsWith("allusers")){

            MyWsServer.sendMsg(webSocket,MyWsServer.getUsers().toString());
        }else if(s.startsWith("886")){
            MyWsServer.exitUser(webSocket);
        }else {
            webSocket.send("我说："+s);
        }

    }

    @Override
    public void onError(WebSocket webSocket, Exception e) {
        System.out.println("onError 错误消息");
    }

    @Override
    public void onStart() {
        System.out.println("onStart 启动");
    }
}
