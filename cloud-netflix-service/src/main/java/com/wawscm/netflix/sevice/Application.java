/*
 * Copyright © 2015-2016 WAWSCM Inc. All rights reserved.
 */
package com.wawscm.netflix.sevice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * TODO
 *
 * @author Wang Chengwei
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

	@RequestMapping("/")
	public String home(HttpServletRequest request) {
        System.out.println(request.getHeader("user-agent"));
        return "Hello world";
	}

	@RequestMapping("/json")
	public String jsonTest(@RequestBody User user) {
	    return "Hello " + user.getUsername() + "! Your password is " + user.getPassword();
    }

	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}
