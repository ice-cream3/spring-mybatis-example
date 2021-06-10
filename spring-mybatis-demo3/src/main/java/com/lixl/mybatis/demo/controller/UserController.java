package com.lixl.mybatis.demo.controller;

import com.lixl.mybatis.demo.pojo.User;
import com.lixl.mybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: lixl
 * @Date: 2021/6/9 15:28
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public Object getUser(@RequestParam("userId")Long userId) {
        User user = userService.findById(userId);
        return user;
    }

    @RequestMapping("/findAnnotateById")
    public Object findAnnotateById(@RequestParam("userId")Long userId) {
        User user = userService.findAnnotateById(userId);
        return user;
    }
}
