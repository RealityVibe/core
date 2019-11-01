package com.example.core.controller;

import com.example.core.facade.DubboFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by yze on 2019/10/23
 * @see
 * @since 20191024
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/core")
public class HelloController {

    @Autowired
    private DubboFacade dubboFacade;

    @RequestMapping("hello")
    public List<String> sayHello(){
            return dubboFacade.sayHello();
    }
}
