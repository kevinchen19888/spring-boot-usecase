package com.kevin.springbootuse.rabbitmq.service;

import com.kevin.springbootuse.rabbitmq.util.RabbitMQUtils;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQService {

    @RabbitListener(queues = "${mq.queue}")
    public void receive(String payload, Channel channel,
                        @Header(AmqpHeaders.DELIVERY_TAG) long tag) {
        log.info("消费内容为：{}", payload);

        RabbitMQUtils.askMessage(channel, tag);
    }
}
