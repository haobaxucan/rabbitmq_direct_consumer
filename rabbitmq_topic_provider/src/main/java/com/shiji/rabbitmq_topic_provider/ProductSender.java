package com.shiji.rabbitmq_topic_provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Value("${mq.config.exchange}")
    private  String exchange;


    public void send(String msg){
        amqpTemplate.convertAndSend(exchange,"product.log.info","product.log.info"+msg);
        amqpTemplate.convertAndSend(exchange,"product.log.error","product.log.error"+msg);
    }

}
