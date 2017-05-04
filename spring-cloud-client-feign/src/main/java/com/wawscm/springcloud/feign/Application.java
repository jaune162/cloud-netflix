/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.feign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * feign client test application.
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients
public class Application {

    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }

}
