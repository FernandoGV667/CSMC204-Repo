package com.fgonzalesv.project2;

import java.util.EmptyStackException;
import java.util.stream.IntStream;

public class MyStack<T> implements StackInterface<T> {

    private T[] data;
    private int topIndex = -1;
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;

    public MyStack(int initCapacity) {
                data = (T[]) new Object [initCapacity];
    }

    public MyStack(){
        this(INITIAL_CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public T pop() {
        T topOfStack = peek();
        data[topIndex] = null;
        size--;
        topIndex--;
        return topOfStack;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean push(T e) {
        if (size == data.length) {
            return false;
        }
        data[size] = e;
        size++;
        topIndex++;
        return true;
    }

    @Override
    public T[] toArray() {
        return (T[]) IntStream.rangeClosed(1, data.length)
                .mapToObj(i -> data[data.length - i])
                .toArray();
    }

    private T peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return data[topIndex];
    }
}
