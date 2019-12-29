package com.shiji.rabbitmq_topic_provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserSender {
    @Autowired
    private AmqpTemplate amqpTemplate;
    @Value("${mq.config.exchange}")
    private  String exchange;


    public void send(String msg){
        amqpTemplate.convertAndSend(exchange,"user.log.info","user.log.error"+msg);
        amqpTemplate.convertAndSend(exchange,"user.log.error","user.log.error"+msg);
    }

}
