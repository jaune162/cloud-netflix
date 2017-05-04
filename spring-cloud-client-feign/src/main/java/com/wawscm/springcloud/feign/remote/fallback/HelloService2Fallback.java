/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote.fallback;

import org.springframework.stereotype.Component;

import com.wawscm.springcloud.feign.remote.client.HelloService2Client;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@Component
public class HelloService2Fallback implements HelloService2Client {

    @Override
    public String hello() {
        return "ERROR";
    }
}
