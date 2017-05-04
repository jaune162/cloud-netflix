/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign.remote;

import com.wawscm.springcloud.feign.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
public interface HelloService2 {

    @RequestMapping(value = "/json")
    String json(@RequestBody User user);

}
