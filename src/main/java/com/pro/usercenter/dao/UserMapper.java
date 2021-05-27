package com.pro.usercenter.dao;

import com.pro.usercenter.dto.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 */
public interface UserMapper extends Mapper<User> {
    @Select("SELECT * FROM user WHERE wx_id=#{wxId}")
    List<User> queryBrandByCid(@Param("wxId") String courseId);
}