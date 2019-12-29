package com.ecpss.rabbitmq_fanout_provider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqFanoutProviderApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {
        sender.send("xc-----");
    }

}
