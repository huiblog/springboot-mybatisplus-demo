package com.zhazhahui.springbootmybatisplusdemo.controller;


import com.zhazhahui.springbootmybatisplusdemo.mapper.DeptMapper;
import com.zhazhahui.springbootmybatisplusdemo.mapper.UserMapper;
import com.zhazhahui.springbootmybatisplusdemo.pojo.Dept;
import com.zhazhahui.springbootmybatisplusdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhazhahui
 * @since 2019-07-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @PostMapping
    public void add(@RequestBody User user){
        userMapper.insert(user);
    }

    @GetMapping
    public String find(String name){
       User user =  userMapper.getUser(name);
       return user.toString();
    }



}

