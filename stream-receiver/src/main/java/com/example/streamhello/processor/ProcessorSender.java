package com.example.streamhello.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@EnableBinding(Processor.class)
@Component
public class ProcessorSender {

    @Resource
    private MessageChannel output;

//    @Scheduled(cron = "0/1 * * * * ?")
    public void send(){
        String msg = "hi";
        System.out.println("send:" + msg);
        output.send(MessageBuilder.withPayload(msg).build());
    }
}
