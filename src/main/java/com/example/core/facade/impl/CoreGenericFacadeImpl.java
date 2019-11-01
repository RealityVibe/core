package com.example.core.facade.impl;

import com.alibaba.dubbo.rpc.service.GenericException;
import com.alibaba.dubbo.rpc.service.GenericService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by yze on 2019/10/31
 * @see
 * @since 20191128
 */
public class CoreGenericFacadeImpl implements GenericService {

    @Override
    public Object $invoke(String method, String[] parameterTypes, Object[] args) throws GenericException {
        List<String> list = new ArrayList<String>();
        list.add("Hello, this is generic service");
        return list;
    }
}
