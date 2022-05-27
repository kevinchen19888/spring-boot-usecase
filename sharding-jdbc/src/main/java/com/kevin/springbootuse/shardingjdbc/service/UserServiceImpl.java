package com.kevin.springbootuse.shardingjdbc.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.kevin.springbootuse.shardingjdbc.entity.TestUser;
import com.kevin.springbootuse.shardingjdbc.entity.User;
import com.kevin.springbootuse.shardingjdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<TestUser> selectList() {
        QueryWrapper<TestUser> wrapper = new QueryWrapper<TestUser>();
        wrapper.orderByAsc("id");
        List<TestUser> users = userMapper.selectList(wrapper);
        return users;
    }

    @Override
    public List<TestUser> getUsers() {
        return userMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public TestUser getUser(Integer id) {
        return null;
    }

    @Override
    public boolean deleteOne(Integer id) {
        int i = userMapper.deleteById(id);
        return i > 0;
    }

    @Override
    public int insert(TestUser user) {
        return userMapper.insert(user);
    }

}
