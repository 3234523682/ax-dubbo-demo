package com.anxi.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.anxi.dubbo.service.DubboDemoService;

/**
 * @author linjing
 */
@Service(version = "${demo.service.version}")
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}
