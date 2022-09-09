package com.example.userabbitmq.message.useFanout;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class UseFanoutConsumer {

    //@RabbitListener 可以标注在类上面，需配合 @RabbitHandler 注解一起使用。
    //@RabbitListener 标注在类上面表示当有收到消息的时候，就交给 @RabbitHandler 的方法处理，根据接受的参数类型进入具体的方法中。
    //@RabbitListener 标注在方法上，是指定某方法作为消息消费的方法，直接监听指定的队列，此时接收的参数需要与发送的类型一致。
    @RabbitListener(queues = "use.fanout.queue")
    public void useFanout(String str) {
        System.out.println("成功收到" + str);
    }


}
