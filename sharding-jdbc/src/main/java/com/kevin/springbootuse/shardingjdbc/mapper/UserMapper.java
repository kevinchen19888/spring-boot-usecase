package com.kevin.springbootuse.shardingjdbc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kevin.springbootuse.shardingjdbc.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<TestUser> {

}