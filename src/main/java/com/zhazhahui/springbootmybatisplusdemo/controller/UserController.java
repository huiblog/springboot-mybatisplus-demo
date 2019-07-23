package com.zhazhahui.springbootmybatisplusdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhazhahui.springbootmybatisplusdemo.dao.UserMapper;
import com.zhazhahui.springbootmybatisplusdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Wrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/all")
    public void userTest() {
        List<User> list = userMapper.selectList(null);

        QueryWrapper queryWrapper = new QueryWrapper<User>();
        queryWrapper.eq("name","zzh");
        User user = userMapper.selectOne(queryWrapper);


        User user2 = new User();
        user2.setEmail("971302121@qq.com");
        user2.setAge(25);
        user2.setName("渣渣辉");
        userMapper.insert(user2);
        System.out.println("插入成功");

        user.setName("updateName");
        userMapper.updateById(user);

    }

    @RequestMapping("/page")
    public void pageSelect(int pageSize,int pageNum){

        Page<User> page = new Page<User>(pageNum ,pageSize);

        IPage<User> userList = userMapper.selectPage(page,null);


        System.out.println("总记录数===" + userList.getTotal());

        System.out.println("当前页码===" + userList.getCurrent());

        System.out.println("总页码===" + userList.getPages());

        System.out.println("每页长度" + userList.getSize());

        System.out.println("" + userList);


    }


}



