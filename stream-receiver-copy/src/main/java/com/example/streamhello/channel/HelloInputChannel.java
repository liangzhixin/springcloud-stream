package com.example.streamhello.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloInputChannel {

    String CHANNEL = "hello";

    @Input(CHANNEL)
    SubscribableChannel input();
}
