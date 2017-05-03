/**
 * Created by Jaune on 2017/4/25.
 */

package com.codestd.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Application {

    @Value("${name}")
    private String name;

    @Value("${remote.url}")
    private String remoteUrl;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/name")
    public String getName() {
        return this.name;
    }

    @RequestMapping("/remote")
    public String remoteUrl() {
        return this.remoteUrl;
    }
}
