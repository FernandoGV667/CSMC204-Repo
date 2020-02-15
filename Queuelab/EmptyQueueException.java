package com.fgonzalesv.queuelab;

public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException() {
        super("The queue is empty");
    }
}
