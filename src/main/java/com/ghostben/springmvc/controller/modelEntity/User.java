package com.ghostben.springmvc.controller.modelEntity;

import lombok.Data;

/**
 * @program: springmvc3
 * @description: 用户注册类，前端用户注册，直接把类映射到这个类
 * @author: ghostben
 * @create: 2018-11-27 20:54
 **/
@Data
public class User {
    private String username;
    private String password;
    private Integer age;
    private String email;
    private Locate locate;
}