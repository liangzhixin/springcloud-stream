package com.example.streamhello.custom;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface HelloOutputChannel {

    String CHANNEL = "hello";

    @Output(HelloOutputChannel.CHANNEL)
    MessageChannel output();
}
