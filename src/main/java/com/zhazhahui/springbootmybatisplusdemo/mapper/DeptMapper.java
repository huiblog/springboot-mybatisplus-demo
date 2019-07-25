package com.zhazhahui.springbootmybatisplusdemo.mapper;

import com.zhazhahui.springbootmybatisplusdemo.pojo.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhazhahui
 * @since 2019-07-25
 */
public interface DeptMapper extends BaseMapper<Dept> {


    public Dept getdeptUsers(Long id);

}
