package com.kevin.springbootuse.shardingjdbc.controller;

import com.kevin.springbootuse.shardingjdbc.entity.TestUser;
import com.kevin.springbootuse.shardingjdbc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public Object getUsers() {
        List<TestUser> list = userService.getUsers();
        Collections.sort(list);
        return list;
    }

    @GetMapping("/getUser")
    public Object getUser(@RequestParam Integer id) {
        return userService.getUser(id);
    }

    @GetMapping("/addUsers")
    public Object add() {
        for (int i = 1; i <= 5; i++) {
            TestUser user = new TestUser();
            user.setId((long) i);
            user.setUsername("sharding-" + (i));
            user.setPassword("pw" + i);
            long resutl = userService.insert(user);
            logger.info("insert:" + user + " result:" + resutl);
        }
        return "添加成功";
    }

    @GetMapping("/deleteOne")
    public Object deleteOne(@RequestParam Integer id) {
        userService.deleteOne(id);
        return "删除成功！";
    }
}