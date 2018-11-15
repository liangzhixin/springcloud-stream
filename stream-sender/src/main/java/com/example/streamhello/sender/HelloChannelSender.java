package com.example.streamhello.sender;

import com.example.streamhello.channel.HelloChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@EnableBinding(HelloChannel.class)
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
