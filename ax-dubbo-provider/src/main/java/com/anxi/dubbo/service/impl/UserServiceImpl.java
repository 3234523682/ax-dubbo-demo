package com.anxi.dubbo.service.impl;

import com.anxi.dubbo.model.User;
import com.anxi.dubbo.service.UserService;
import com.anxi.dubbo.service.dao.UserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linjing
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        PageHelper.startPage(1, 2);
        return this.userMapper.getAll();
    }

    @Override
    public void install(User user) {
        this.userMapper.install(user);
    }

}
