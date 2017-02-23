package com.raycloud.newtest.dao.imp;

import com.alibaba.cobar.client.CobarSqlMapClientDaoSupport;
import com.raycloud.newtest.dao.IUserDAO;
import com.raycloud.newtest.entity.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 001117020015 on 2017/2/17.
 */
public class UserImp extends SqlMapClientDaoSupport implements IUserDAO {
    @Override
    public User queryById(int id) {
        /*根据ID查找用户*/
        User user=(User)getSqlMapClientTemplate().queryForObject("queryById",id);
        return  user;
    }
    @Override
    /*根据用户名查找用户*/
    public User queryByName(String name) {
        User user=(User)getSqlMapClientTemplate().queryForObject("queryByName",name);
        return  user;
    }


}
