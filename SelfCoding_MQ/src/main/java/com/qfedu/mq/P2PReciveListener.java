package com.qfedu.mq;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 *@Author feri
 *@Date Created in 2019/1/18 09:55
 */
public class P2PReciveListener {
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

        //6、创建消息消费者
        MessageConsumer messageConsumer=session.createConsumer(queue);
        System.out.println("P2P消息接收器运行中……");
        //7、设置消息监听器
        messageConsumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if(message instanceof TextMessage){
                    TextMessage textMessage=(TextMessage)message;
                    try {
                        System.out.println("文本消息："+textMessage.getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        //9、关闭、销毁
       /* session.close();
        connection.close();*/
    }
}