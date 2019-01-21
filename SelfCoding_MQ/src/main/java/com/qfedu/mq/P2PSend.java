package com.qfedu.mq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *@Author feri
 *@Date Created in 2019/1/18 09:54
 */
public class P2PSend {
    private static String url="tcp://39.105.189.141:61616";
    public static void main(String[] args) throws JMSException {
        //1、创建工厂
        ActiveMQConnectionFactory factory=new ActiveMQConnectionFactory(ActiveMQConnectionFactory.DEFAULT_USER,ActiveMQConnection.DEFAULT_PASSWORD,url);
        //2、创建连接对象
        Connection connection=factory.createConnection();
        //3、启动连接
        connection.start();
        //4、获取会话信息 参数说明：1、是否开启事务 2、消息的应答模式
        Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        //5、创建存储消息对象
        Queue queue=session.createQueue("ZZJava1806");
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入要发送的消息：");
            String msg=scanner.nextLine();
            //6、创建要发送的消息
            TextMessage textMessage=session.createTextMessage();
            textMessage.setText(msg);
            //7、创建消息提供者
            MessageProducer messageProducer=session.createProducer(queue);
            //8、发送消息
            messageProducer.send(textMessage);
        }

        //9、关闭、销毁
      /*  session.close();
        connection.close();*/
    }
}