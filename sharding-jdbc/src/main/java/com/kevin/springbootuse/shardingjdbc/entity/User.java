package com.kevin.springbootuse.shardingjdbc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 358157380505039579L;

    /**
     * 用户id
     */
    @TableId(type = IdType.INPUT)
    private Integer id;

    /**
     * 用户名称
     */
    private String name;


    /**
     * 性别
     */
    private String sex;

}
