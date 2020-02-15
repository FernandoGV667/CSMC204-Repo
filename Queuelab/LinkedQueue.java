package com.fgonzalesv.queuelab;

public final class LinkedQueue<T> implements QueueInterface<T>{
    private Node firstNode;
    private Node lastNode;


    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty()){
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T front = getFront();
        firstNode.setData(null);
        firstNode = firstNode.getNextNode();
        if (firstNode == null)
            lastNode = null;
        return front;
    }

    @Override
    public T getFront() {
        if(isEmpty()){
            throw new EmptyQueueException();
        } else {
            return firstNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
    }

    private class Node {
        private T data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        private Node(T data){
            this(data,null);
        }

        private T getData() {
            return data;
        }

        private void setData(T data) {
            this.data = data;
        }

        private Node getNextNode() {
            return next;
        }

        private void setNextNode(Node next) {
            this.next = next;
        }
    }

}
