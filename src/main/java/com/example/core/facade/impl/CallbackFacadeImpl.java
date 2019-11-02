package com.example.core.facade.impl;

import com.example.core.facade.CallbackFacade;
import com.example.core.facade.CallbackListener;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author by yze on 2019/11/2
 * @see
 * @since 20191128
 */
public class CallbackFacadeImpl implements CallbackFacade {

    private final Map<String, CallbackListener> listeners = new ConcurrentHashMap<String, CallbackListener>();

    public CallbackFacadeImpl() {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (Map.Entry<String, CallbackListener> entry : listeners.entrySet()) {
                        try {
                            entry.getValue().changed(getChanged(entry.getKey()));
                        } catch (Throwable e) {
                            listeners.remove(entry.getKey());
                        }
                    }
                    Thread.sleep(5000);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    public void addListener(String key, CallbackListener listener) {
        listeners.put(key, listener);
        listener.changed(getChanged(key)); // 发送变更通知
    }

    private String getChanged(String key) {
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
