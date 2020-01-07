package com.example.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @author by yze on 2020/1/5
 * @see
 * @since 20200222
 */
@Component
@EnableScheduling
public class MqSenderService {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    @Scheduled(fixedDelay = 2000)
    public void send() {
        jmsTemplate.convertAndSend(this.queue, "hello, this is yze");
    }
}
