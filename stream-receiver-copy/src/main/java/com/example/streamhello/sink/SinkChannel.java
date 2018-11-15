package com.example.streamhello.sink;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkChannel {

    String OUTPUT = "sink";

    @Output(OUTPUT)
    MessageChannel output();
}
