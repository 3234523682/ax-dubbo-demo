package com.anxi.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.anxi.dubbo.service.DubboDemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linjing
 */
@RestController
public class DubboDemoController {

    @Reference(version = "${demo.service.version}")
    private DubboDemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}
