package com.kevin.springbootuse.web.controller.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ValidReq {
    @NotBlank(message = "name 不能为空")
    private String name;
    @NotNull(message = "age 不能为null")
    private Integer age;
}
