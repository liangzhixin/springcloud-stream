package com.example.streamhello.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloChannel {

    String CHANNEL = "hello";

    @Output(HelloChannel.CHANNEL)
    MessageChannel output();
}
