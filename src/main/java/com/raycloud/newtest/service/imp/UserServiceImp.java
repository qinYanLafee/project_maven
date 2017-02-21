package com.raycloud.newtest.service.imp;

import com.raycloud.newtest.dao.imp.UserImp;
import com.raycloud.newtest.entity.User;
import com.raycloud.newtest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 001117020015 on 2017/2/17.
 */
@Service("userServiceImp")
public class UserServiceImp implements IUserService{
    @Autowired
    private UserImp userImp;
    public User queryById(int id){
        User user=userImp.queryById(id);
        return user;
    };
    public User queryByName(String  name){
        User user =userImp.queryByName(name);
        System.out.println("我是秦延");
        return  user;
    };
    public List<User> queryAll(){
        List<User> users =userImp.queryAll();
        System.out.println("我是秦延");
        return  users;
    }

}
