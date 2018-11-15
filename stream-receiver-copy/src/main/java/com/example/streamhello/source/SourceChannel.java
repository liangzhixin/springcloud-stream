package com.example.streamhello.source;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.SubscribableChannel;

public interface SourceChannel {

    String INPUT = "source";

    @Input(SourceChannel.INPUT)
    SubscribableChannel input();
}
