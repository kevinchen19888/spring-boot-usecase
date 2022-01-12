package com.kevin.springbootuse;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevin.springbootuse.web.WebApplication;
import com.kevin.springbootuse.web.controller.pojo.ValidReq;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

@SpringBootTest(classes = WebApplication.class)
@AutoConfigureMockMvc
public class ValidationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testValid() throws Exception {
        ValidReq req = ValidReq.builder()
                .name("")
                .age(11)
                .build();
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders
                .request(HttpMethod.POST, URI.create("/valid"))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON_UTF8)
                .content(new ObjectMapper().writeValueAsString(req)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(result -> System.out.println())
                .andReturn();

        System.out.println(mvcResult.getResponse().getContentAsString());

    }


}
