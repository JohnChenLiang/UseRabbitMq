package com.example.userabbitmq.message.useDirect;

import com.example.userabbitmq.pojo.Log;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UseDirectConsumer {

    //接收对象。@RabbitListener 标注在方法上，是指定某方法作为消息消费的方法，直接监听指定的队列，此时接收的参数需要与发送的类型一致。
    @RabbitListener(queues = "use.direct.queue")
    public void useDirect(Log log) {
        System.out.println("收到333:" + log.toString());
        System.out.println("消费信息333：" + log.getParams());
    }

    //接收字符串。@RabbitListener 标注在方法上，是指定某方法作为消息消费的方法，直接监听指定的队列，此时接收的参数需要与发送的类型一致。
    @RabbitListener(queues = "use.direct.queue")
    public void useDirect(String str) {
        System.out.println("收到444:" + str);
        System.out.println("消费信息444：" + str);
    }
}
