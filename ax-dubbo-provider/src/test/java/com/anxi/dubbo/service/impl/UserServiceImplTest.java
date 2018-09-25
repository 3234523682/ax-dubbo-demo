package com.anxi.dubbo.service.impl;

import com.anxi.dubbo.model.User;
import com.anxi.dubbo.service.ProviderSpringBootApplication;
import com.anxi.dubbo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linjing
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProviderSpringBootApplication.class})
public class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void getAll() {
        log.info("============ getAll");
        List<User> all = userService.getAll();
        log.info("============ List TYPE：{}", all.getClass());
        log.info("============ all：{}", all);
    }

    @Test
    public void install() {
        log.info("============ install");
        User user = new User("测试003", "000000", "18888888888");
        userService.install(user);
        log.info("============ install userId：{}", user.getUserId());
    }
}