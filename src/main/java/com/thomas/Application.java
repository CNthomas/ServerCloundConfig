package com.thomas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2018\5\2 0002.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
