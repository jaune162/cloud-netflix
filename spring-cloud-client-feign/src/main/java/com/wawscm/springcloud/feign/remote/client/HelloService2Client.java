/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.wawscm.springcloud.feign.remote.HelloService2;
import com.wawscm.springcloud.feign.remote.fallback.HelloService2Fallback;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@FeignClient(name = "STORES", fallback = HelloService2Fallback.class)
public interface HelloService2Client extends HelloService2 {
}
