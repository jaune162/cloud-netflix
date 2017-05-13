/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.auth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@SpringBootApplication
@EnableAuthorizationServer
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
