package com.example.core.facade;

/**
 * 回调服务
 *
 * @author yze
 */
public interface CallbackFacade {

    void addListener(String key, CallbackListener listener);
}
