package com.fgonzalesv.project2;

public class ContainerException extends RuntimeException {

    public ContainerException(){};

    ContainerException(String message){
        super(message);
    }
}
