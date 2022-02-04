package com.kevin.springbootuse.controller;

import com.kevin.springbootuse.util.KafkaSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
// @RestController("/kafka")
public class KafkaUseCaseController {
    private final KafkaSender kafkaSender;

    public KafkaUseCaseController(KafkaSender kafkaSender) {
        this.kafkaSender = kafkaSender;
    }

    @GetMapping("/sendMsg")
    @ResponseBody
    public String sendMsg(
            @RequestParam("msg") String msg
    ) {
        kafkaSender.send("someTopic", msg);
        return "send success!";
    }

    @KafkaListener(groupId = "myGroup", topics = "someTopic")
    public void receive(String msg) {
        log.info("receive the kafka msg is:{}", msg);
    }

}
