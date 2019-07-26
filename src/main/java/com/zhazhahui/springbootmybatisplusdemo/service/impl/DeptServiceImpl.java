package com.zhazhahui.springbootmybatisplusdemo.service.impl;

import com.zhazhahui.springbootmybatisplusdemo.pojo.Dept;
import com.zhazhahui.springbootmybatisplusdemo.mapper.DeptMapper;
import com.zhazhahui.springbootmybatisplusdemo.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
