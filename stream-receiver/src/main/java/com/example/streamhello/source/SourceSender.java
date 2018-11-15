package com.example.streamhello.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//@EnableBinding({Source.class})
@Component
public class SourceSender {

    @Resource
    private MessageChannel output;

//    @Scheduled(cron = "0/1 * * * * ?")
    public void send(){
        String msg = "da jia hao!";
        System.out.println("send:" + msg);
        output.send(MessageBuilder.withPayload(msg).build());
    }
}
