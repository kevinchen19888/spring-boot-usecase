package com.kevin.springbootuse.shardingjdbc.service;

import com.kevin.springbootuse.shardingjdbc.entity.TestUser;

import java.util.List;

public interface UserService {
    List<TestUser> selectList();

    List<TestUser> getUsers();

    TestUser getUser(Integer id);

    boolean deleteOne(Integer id);
    int insert(TestUser user);
}
