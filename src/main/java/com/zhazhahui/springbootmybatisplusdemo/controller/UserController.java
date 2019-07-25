package com.zhazhahui.springbootmybatisplusdemo.controller;


import com.zhazhahui.springbootmybatisplusdemo.mapper.DeptMapper;
import com.zhazhahui.springbootmybatisplusdemo.mapper.UserMapper;
import com.zhazhahui.springbootmybatisplusdemo.pojo.Dept;
import com.zhazhahui.springbootmybatisplusdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhazhahui
 * @since 2019-07-25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @PostMapping
    @ResponseBody
    public void add(@RequestBody User user){
        userMapper.insert(user);
    }



}

