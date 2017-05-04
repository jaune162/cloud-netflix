/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.controller;

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
public class FeignClientTest2Controller implements HelloService2 {

    @Autowired
    private HelloService2Client helloService2Client;

    @RequestMapping("/test")
    @Override
    public String hello() {
        return helloService2Client.hello();
    }
}
