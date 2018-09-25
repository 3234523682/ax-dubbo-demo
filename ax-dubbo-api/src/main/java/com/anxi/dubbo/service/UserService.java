package com.anxi.dubbo.service;

import com.anxi.dubbo.model.User;

import java.util.List;

/**
 * @author linjing
 */
public interface UserService {

    /**
     * 获取所有用户
     *
     * @return 用户集合列表
     */
    List<User> getAll();

    /**
     * 新添用户
     *
     * @param user 用户信息
     */
    void install(User user);
}
