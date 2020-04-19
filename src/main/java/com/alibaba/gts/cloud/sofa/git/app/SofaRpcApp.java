package com.alibaba.gts.cloud.sofa.git.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:META-INF/spring/*.xml")
public class SofaRpcApp {

    public static void main(String[] args) {
        SpringApplication.run(SofaRpcApp.class, args);
    }

}
