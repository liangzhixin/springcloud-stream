package com.example.streamhello.receiver;

import com.example.streamhello.channel.HelloInputChannel;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(HelloInputChannel.class)
public class HelloChannelReceiver {

    @StreamListener(HelloInputChannel.CHANNEL)
    public void receive(String msg){
        System.out.println("receive:" + msg);
    }

    @StreamListener(HelloInputChannel.CHANNEL)
    public void receive2(String msg){
        System.out.println("receive2:" + msg);
    }
}
