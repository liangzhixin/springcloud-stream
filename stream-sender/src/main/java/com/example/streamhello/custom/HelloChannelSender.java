package com.example.streamhello.custom;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@EnableBinding(HelloOutputChannel.class)
@Component
public class HelloChannelSender {

    @Resource
    private MessageChannel hello;

    @Scheduled(cron = "0/5 * * * * ?")
    public void send(){
        String msg = "hello world!";
        hello.send(MessageBuilder.withPayload(msg).build());
        System.out.println("send:" + msg);
    }

}
