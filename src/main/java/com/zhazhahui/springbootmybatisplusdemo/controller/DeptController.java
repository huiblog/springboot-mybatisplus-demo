package com.zhazhahui.springbootmybatisplusdemo.controller;


import com.zhazhahui.springbootmybatisplusdemo.mapper.DeptMapper;
import com.zhazhahui.springbootmybatisplusdemo.pojo.Dept;
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
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptMapper deptMapper;


    @PostMapping
    public void add(@RequestBody Dept dept){
        deptMapper.insert(dept);
    }

    @GetMapping("/{deptId}")
    public void add(@PathVariable int deptId){
        deptMapper.getdeptUsers(Long.valueOf(deptId));
    }




}

