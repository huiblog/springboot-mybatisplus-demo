package com.zhazhahui.springbootmybatisplusdemo.service.impl;

import com.zhazhahui.springbootmybatisplusdemo.pojo.User;
import com.zhazhahui.springbootmybatisplusdemo.mapper.UserMapper;
import com.zhazhahui.springbootmybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhazhahui
 * @since 2019-07-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
