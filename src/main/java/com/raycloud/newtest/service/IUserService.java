package com.raycloud.newtest.service;

import com.raycloud.newtest.entity.User;

/**
 * Created by 001117020015 on 2017/2/17.
 */
public interface IUserService {
    public User queryById(int id);
    public User queryByName(String  name);
}
