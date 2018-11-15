package com.example.streamgroupreceiver.custom;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloInputChannel.class)
public class HelloChannelReceiver {

    @StreamListener(HelloInputChannel.INPUT)
    public void receive(String msg){
        System.out.println("receive:" + msg);
    }

    @StreamListener(HelloInputChannel.INPUT)
    public void receive2(String msg){
        System.out.println("receive2:" + msg);
    }
}
