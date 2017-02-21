package com.raycloud.newtest.controller;

import com.raycloud.newtest.entity.User;
import com.raycloud.newtest.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;

@SessionAttributes(value={"user"})
@Controller
@RequestMapping("/handler")
public class userAction {
    @Qualifier(value = "userServiceImp")
    @Autowired
    private UserServiceImp userServiceImp;
    /*根据ID查询用户*/
    @RequestMapping(value="/user",method= RequestMethod.GET)
    public  String  queryById(Map<String,Object> map){
        System.out.println("我是秦延");
        User user=userServiceImp.queryById(2);
        System.out.println("我是秦延1");
        System.out.println(user);
        map.put("user",user);
        return "list";
    }
    /*查找所有用户*/
    @RequestMapping(value="/Listuser",method= RequestMethod.GET)
    public List<User> queryAll(Map<String,Object> map){
        List<User> users=userServiceImp.queryAll();
        return  users;
        /*qinyan*/
    }



}
