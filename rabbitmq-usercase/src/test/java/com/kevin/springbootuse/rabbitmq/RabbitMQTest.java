package com.kevin.springbootuse.rabbitmq;

import com.kevin.springbootuse.rabbitmq.config.MQProperties;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private MQProperties mqProperties;

    @Test
    public void testSendMessage() {
        rabbitTemplate.convertAndSend(mqProperties.getDefaultExchange(),
                mqProperties.getRouteKey(), "发送了一条信息");
    }
}
