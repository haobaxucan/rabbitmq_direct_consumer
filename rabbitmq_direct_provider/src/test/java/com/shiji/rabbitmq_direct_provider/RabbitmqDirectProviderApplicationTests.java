package com.shiji.rabbitmq_direct_provider;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RabbitmqDirectProviderApplicationTests {
@Autowired
private Sender sender;
    @Test
    void contextLoads() {
        sender.send("hello xc");
    }

}
