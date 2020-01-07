package com.example.core.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author by yze on 2020/1/5
 * @see
 * @since 20200222
 */
@Component
public class MqConsumerService {


    @JmsListener(destination = "yze_queue")
    public void receiveQueue(String consumer){
        System.out.println(consumer + "消息已收到（消费）！");
    }
}
