package com.example.streamhello.source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(SourceChannel.class)
public class SourceReceiver {

    @StreamListener(SourceChannel.INPUT)
    public void receive(String msg){
        System.out.println("receive:" + msg);
    }
}
