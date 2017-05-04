/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote.fallback;

import com.wawscm.springcloud.feign.remote.HelloService;
import org.springframework.stereotype.Component;

/**
 * fallback
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello() {
        return "error";
    }
}
