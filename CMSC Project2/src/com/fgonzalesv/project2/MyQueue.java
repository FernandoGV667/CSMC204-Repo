package com.fgonzalesv.project2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueInterface<T> {

    private List<T> data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    public MyQueue(int initCapacity) {
        size = initCapacity;
        data = new ArrayList<>(initCapacity);
    }

    public MyQueue(){
        this(INITIAL_CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return data.size() == size;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        return data.remove(0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean enqueue(T e) {
        if (isFull()){
            return false;
        }
        return data.add(e);
    }

    @Override
    public T[] toArray() {
        return (T[]) data.toArray();
    }
}
