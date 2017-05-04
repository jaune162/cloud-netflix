/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.controller;

import com.wawscm.springcloud.feign.model.User;
import com.wawscm.springcloud.feign.remote.HelloService2;
import com.wawscm.springcloud.feign.remote.client.HelloService2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wawscm.springcloud.feign.remote.HelloService;

/**
 * client test
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@RestController
public class FeignClientTest2Controller {

    @Autowired
    private HelloService2Client helloService2Client;

    @RequestMapping("/test")
    public String hello() {
        User user = new User();
        user.setUsername("Jaune");
        user.setPassword("123456");
        return helloService2Client.json(user);
    }
}
