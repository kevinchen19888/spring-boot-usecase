package com.kevin.springbootuse.mybatisuse;


import com.kevin.springbootuse.mybatisuse.dao.entity.User;
import com.kevin.springbootuse.mybatisuse.dao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("inner") // 测试时基于inner配置
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        // Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}

