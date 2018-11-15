package com.example.streamhello.receiver;

import com.example.streamhello.channel.HelloChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloChannel.class)
public class HelloChannelReceiver {

    @StreamListener(HelloChannel.CHANNEL)
    public void receive(String msg){
        System.out.println("receive:" + msg);
    }

    @StreamListener(HelloChannel.CHANNEL)
    public void receive2(String msg){
        System.out.println("receive2:" + msg);
    }
}
