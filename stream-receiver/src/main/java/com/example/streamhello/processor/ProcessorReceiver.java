package com.example.streamhello.processor;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

@EnableBinding(Processor.class)
public class ProcessorReceiver {

    @StreamListener(Processor.INPUT)
    public void receive(String msg){
        System.out.println("receive:" + msg);
    }
}
