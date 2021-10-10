package com.adem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ControllerBackendRootApp {
    public static void main(String[] args) {
        SpringApplication.run(ControllerBackendRootApp.class, args);
    }

    /*@Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }*/
}
