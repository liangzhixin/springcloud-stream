package com.example.streamgroupreceiver.custom;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloInputChannel {

    String INPUT = "hello";

    @Input(INPUT)
    SubscribableChannel input();
}
