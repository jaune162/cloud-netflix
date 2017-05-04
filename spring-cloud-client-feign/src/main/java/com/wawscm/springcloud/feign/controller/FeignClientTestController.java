/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.controller;

import com.wawscm.springcloud.feign.remote.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * client test
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@RestController
public class FeignClientTestController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello();
    }


}
