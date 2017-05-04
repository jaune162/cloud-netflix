/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
public interface HelloService2 {

    @RequestMapping(value = "/")
    String hello();

}
