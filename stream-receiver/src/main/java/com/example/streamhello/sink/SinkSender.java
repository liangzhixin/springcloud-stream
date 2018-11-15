package com.example.streamhello.sink;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableBinding(SinkChannel.class)
@Component
public class SinkSender {

    @Autowired
    private MessageChannel sink;

//    @Scheduled(cron = "0/1 * * * * ?")
    public void send(){
        String msg = "this is a test";
        System.out.println("send:" + msg);
        sink.send(MessageBuilder.withPayload(msg).build());
    }
}
