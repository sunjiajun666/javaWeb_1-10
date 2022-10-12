package com.buba.dao;

import com.buba.entity.BookUser;

/**
 * Author:SmallTiger
 * Date:2022-10-12
 * Time:18:44
 */
public interface BookUserDao {
    // 用户注册方法
    int addBookUser(BookUser bookUser);

    // 通过用户名称和密码查询用户的方法
    int findUserByNameAndPassword(String userName,String password);


}
