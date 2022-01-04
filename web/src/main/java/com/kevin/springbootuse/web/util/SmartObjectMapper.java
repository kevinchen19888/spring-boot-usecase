package com.kevin.springbootuse.web.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class SmartObjectMapper extends ObjectMapper {
    @Override
    public String writeValueAsString(Object value)  {
        String s;
        try {
            s = super.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
        return s;
    }
}
