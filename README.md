# UseRabbitMq
1.发布订阅模式：一条消息被多个消费者消费。不用配路由key。用fanout交换机。
运行起来，在浏览器输入下面的网址即可看效果。idea控制台有相应打印效果
http://localhost:3001/use/fanoutTest
    
2.路由模式：有选择的接收消息。有routingKey，用direct交换机。
运行起来，在浏览器输入下面的网址即可看效果。idea控制台有相应打印效果
http://localhost:3001/use/directTest
