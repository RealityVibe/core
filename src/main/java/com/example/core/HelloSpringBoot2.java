package com.example.core;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by yze on 2019/10/17
 * @see
 * @since 20191024
 */
@RestController
@EnableAutoConfiguration
public class HelloSpringBoot2 {

    @RequestMapping("hello2")
    public String sayHello(){
        System.out.println("Hello SpringBoot Demo2");
        return "ccc";
    }


}
