package com.example.streamhello.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloChannel {

    String CHANNEL = "hello";

    @Input(HelloChannel.CHANNEL)
    SubscribableChannel input();
}
