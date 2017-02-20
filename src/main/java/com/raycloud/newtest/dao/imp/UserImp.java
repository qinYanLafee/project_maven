package com.raycloud.newtest.dao.imp;

import com.alibaba.cobar.client.CobarSqlMapClientDaoSupport;
import com.raycloud.newtest.dao.IUserDAO;
import com.raycloud.newtest.entity.User;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import javax.annotation.Resource;

/**
 * Created by 001117020015 on 2017/2/17.
 */
public class UserImp extends SqlMapClientDaoSupport implements IUserDAO {
    @Override
    public User queryById(int id) {
        User user=(User)getSqlMapClientTemplate().queryForObject("queryById",id);
        return  user;
    }
    @Override
    public User queryByName(String name) {
        User user=(User)getSqlMapClientTemplate().queryForObject("queryByName",name);
        return  user;
    }
}
