package com.hs.basic.controller;

import com.hs.basic.dao.UserInfoMapper;
import com.hs.basic.entity.UserInfo;
import com.hs.basic.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: basictemplate
 * @description: 用户控制层
 * @author: Andy
 * @create: 2019-08-14 21:12
 **/

@RestController
@RequestMapping(value = {"/user"})
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = {"/findAll"},produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List getAllUsers(){
        List list =  userService.findAllUser();
        return list;
    }
}
