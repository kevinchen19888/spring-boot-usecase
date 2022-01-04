package com.kevin.springbootuse.web.controller.pojo;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ValidReq {
    @NotNull(message = "name 不能为空")
    private String name;
    private Integer age;
}
