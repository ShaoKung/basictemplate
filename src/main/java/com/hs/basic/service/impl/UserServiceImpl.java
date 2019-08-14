package com.hs.basic.service.impl;

import com.hs.basic.dao.UserInfoMapper;
import com.hs.basic.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: basictemplate
 * @description: 接口实现类
 * @author: Andy
 * @create: 2019-08-14 23:27
 **/

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userDao;//这里可能会报错，但是并不会影响

    @Override
    public List findAllUser(){
        return  userDao.findAllUser();
    }
}
