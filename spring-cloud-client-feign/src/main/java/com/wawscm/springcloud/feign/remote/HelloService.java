/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote;

import com.wawscm.springcloud.feign.remote.fallback.HelloServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@FeignClient(name = "STORES", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/")
    String hello();
}
