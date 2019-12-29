package com.shiji.rabbitmq_topic_provider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqTopicProviderApplicationTests {


    @Autowired
    private orderSender orderSender;
    @Autowired
    private ProductSender productSender;
    @Autowired
    private UserSender userSender;

    @Test
    void contextLoads() {
        orderSender.send("heexc");
        userSender.send("heexc");
        productSender.send("heexc");
    }

}
