package com.zhazhahui.springbootmybatisplusdemo.mapper;

import com.zhazhahui.springbootmybatisplusdemo.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhazhahui
 * @since 2019-07-25
 */
public interface UserMapper extends BaseMapper<User> {

    User getUser(@Param("name") String name);

}
