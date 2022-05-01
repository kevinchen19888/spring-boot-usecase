package com.kevin.springbootuse.web.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@RestController
public class JmeterTest {
    final AtomicInteger count = new AtomicInteger(0);
    private Queue<Greeting> objCache = new ConcurrentLinkedDeque<>();

    @GetMapping("/loadTest")
    public Greeting greeting() {
        Greeting greeting = new Greeting("Hello World!");

        if (objCache.size() >= 200000) {
            objCache.clear();
        } else {
            objCache.add(greeting);
        }
        if (count.incrementAndGet() % 2000 ==0  ) {
            log.info("请求数量count:{}",count.get());
        }
        return greeting;
    }
}

@Data
@AllArgsConstructor
class Greeting {
    private String message;
}
