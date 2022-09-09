package com.example.userabbitmq.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/use")
public class UseController {

    @Autowired
    private RabbitTemplate rabbitTemplate; //你应该使用RabbitTemplate。AmqpTemplate是一个接口。 RabbitTemplate是AmqpTemplate接口的一个实现。

    //运行起来，在浏览器输入下面的网址即可看效果。idea控制台有相应打印效果
    //http://localhost:3001/use/fanoutTest
    @GetMapping("/fanoutTest")
    public String fanoutTest(){
        System.out.println("进入fanoutTest");

        String str = "这里是用fanout模式传的字符串";

        //第一个参数是 交换器名称。第二个参数是 路由key，fanout交换机 不用配路由key，这里放空串。第三个参数是要传递的对象。
        rabbitTemplate.convertAndSend("use.fanout.exchange", "", str);
        System.out.println("消息发送成功");

        return "111111111";
    }


}
