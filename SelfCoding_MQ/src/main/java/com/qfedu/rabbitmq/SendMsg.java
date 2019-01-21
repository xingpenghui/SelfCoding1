package com.qfedu.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 *@Author feri
 *@Date Created in 2019/1/18 14:10
 */
public class SendMsg {
    public static void main(String[] args) throws IOException, TimeoutException {
        //1、创建工厂
        ConnectionFactory connectionFactory=new ConnectionFactory();
        //2、设置连接信息
        connectionFactory.setHost("39.105.189.141");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("guest");
        connectionFactory.setPassword("guest");
        connectionFactory.setVirtualHost("/");
        //3、获取连接对象
        Connection connection=connectionFactory.newConnection();
        //4、创建通道对象
        Channel channel=connection.createChannel();
        //5、创建消息存储对象
        /**
         * 参数说明：
         * 1、队列名称
         * 2、是否持久化
         * 3、是否独占队列
         * 4、断开之后是否自动删除消息
         * 5、参数信息*/
        channel.queueDeclare("ZZ1806",false,false,false,null);
        //6、发送消息
        channel.basicPublish("","ZZ1806",null,"Java1806学员".getBytes());
        //7、销毁
        channel.close();
        connection.close();

    }
}
