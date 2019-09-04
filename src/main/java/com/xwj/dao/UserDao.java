package com.xwj.dao;

import com.xwj.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserDao {
    void insertUser(User user);

//    @Select(value = "select * from user where id=#{id}")
    User getUser(@Param("id") int id);
}
