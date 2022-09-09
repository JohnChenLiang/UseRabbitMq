package com.example.userabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue useFanoutQueue(){
        return new Queue("use.fanout.queue");
    }

    // 配置发布订阅模式的fanout交换机
    @Bean
    FanoutExchange useFanoutExchange(){
        return new FanoutExchange("use.fanout.exchange");
    }

    //交换器绑定队列
    @Bean
    Binding useFanoutBinding(Queue useFanoutQueue, FanoutExchange useFanoutExchange){
        return BindingBuilder.bind(useFanoutQueue).to(useFanoutExchange);
    }

}
