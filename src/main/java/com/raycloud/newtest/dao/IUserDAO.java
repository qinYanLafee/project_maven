package com.raycloud.newtest.dao;

import com.raycloud.newtest.entity.User;

import java.util.List;

/**
 * Created by 001117020015 on 2017/2/17.
 */
public interface IUserDAO {
    /*根据用户名查找用户*/
    public User  queryByName(String name);
    /*根据用户ID查找用户*/
    public User  queryById(int id);
}
