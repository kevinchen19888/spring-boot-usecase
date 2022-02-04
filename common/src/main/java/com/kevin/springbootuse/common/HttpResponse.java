package com.kevin.springbootuse.common;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HttpResponse<T> {
    private Integer code;
    private String msg;
    private T data;

}
