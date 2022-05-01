package com.kevin.springbootuse.web.controller;

import com.kevin.springbootuse.web.controller.pojo.ValidReq;
import com.kevin.springbootuse.web.service.DemoService;
import com.kevin.springbootuse.web.util.SmartObjectMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class ValidationController {
    private final SmartObjectMapper mapper;
    private DemoService demoService;
    public ValidationController(SmartObjectMapper mapper, DemoService demoService) {
        this.mapper = mapper;
        this.demoService = demoService;
    }

    @PostMapping("/valid")
    @ResponseBody
    public String valid(@Valid ValidReq req) {
        demoService.doNothing();
        return String.format("验证成功,req:%s",mapper.writeValueAsString(req));
    }
}
