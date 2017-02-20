package com.raycloud.newtest.dao;

import com.raycloud.newtest.entity.User;

import java.util.List;

/**
 * Created by 001117020015 on 2017/2/17.
 */
public interface IUserDAO {
    public User  queryByName(String name);
    public User  queryById(int id);
}
