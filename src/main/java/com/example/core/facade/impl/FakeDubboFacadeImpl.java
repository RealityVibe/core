package com.example.core.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.core.facade.DubboFacade;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yze on 2019/10/17
 * @see
 * @since 20191025
 */
@Service
@Component
public class FakeDubboFacadeImpl implements DubboFacade {

    @Override
    public List<String> sayHello() {
        List<String> list = new ArrayList<>();
        list.add("Fake Hello");
        return list;
    }
}
