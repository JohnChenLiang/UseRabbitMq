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


    @Bean
    public Queue useDirectQueue(){
        return new Queue("use.direct.queue");
    }

    // 配置Routing（路由模式）的direct交换机。
    @Bean
    DirectExchange useDirectExchange() { return new DirectExchange("use.direct.exchange");}

    //direct交换机绑定队列 还有 routingKey
    @Bean
    Binding useDirectBinding() {
        return BindingBuilder.bind(useDirectQueue()).to(useDirectExchange()).with("use.direct.routing.key");
    }
}
