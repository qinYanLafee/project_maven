package com.raycloud.newtest.controller;

import com.raycloud.newtest.entity.User;
import com.raycloud.newtest.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;

@SessionAttributes(value={"user"})
@Controller
@RequestMapping("/handler")
public class userAction {
    @Qualifier(value = "userServiceImp")
    @Autowired
    private UserServiceImp userServiceImp;
    @RequestMapping(value="/user",method= RequestMethod.GET)
    public  String  listUser(Map<String,Object> map){
        System.out.println("我是秦延");
        User user=userServiceImp.queryById(2);
        System.out.println("我是秦延1");
        System.out.println(user);
        map.put("user",user);
        return "list";
    }


}
