/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.springcloud.stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * rabbitmq stream application
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class RabbitMQApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(RabbitMQApplication.class).run(args);
    }

    @StreamListener(Sink.INPUT)
    public void processVote(Object obj) {
        System.out.println(obj);
    }
}
