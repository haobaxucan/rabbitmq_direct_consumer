package com.shiji.rabbitmq_direct_consme;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 *  bindings  绑定队列命令
 *  @Queue(value = 队列名称，autoDelete是否是临时队列
 *  @Exchange(value = 交换机名称,type = ExchangeTypes.DIRECT交换机类型
 */
@Component
@RabbitListener(

        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type = ExchangeTypes.DIRECT),
                key = "${mq.config.info.routing.key}"
        )
)
public class ConsumerInfo {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("consumer:info" + msg);
    }


}
