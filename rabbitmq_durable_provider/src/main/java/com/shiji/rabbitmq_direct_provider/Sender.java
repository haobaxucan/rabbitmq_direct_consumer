package com.shiji.rabbitmq_direct_provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Value("${mq.config.exchange}")
    private  String exchange;
    /**
     * 这里配置不同的路由键
     */
    @Value("${mq.config.info.routing.key}")
//    @Value("${mq.config.error.routing.key}")
    private  String routingKey;

    public void send(String msg){
        amqpTemplate.convertAndSend(exchange,routingKey,msg);
    }

}
