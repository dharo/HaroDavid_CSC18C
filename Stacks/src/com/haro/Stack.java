package com.haro;

/**
 * Created by d on 4/28/16.
 *
 * Goal: Implement a method that grows the stack once the size is reached.
 *       Ideal implementation will use a linked list instead of an array.
 *       Maybe use a Queue...
 */
class Stack<T> {
    private Node<T> head=null, tail=null;
    private int items;
    private int size;

    //automatically make only an empty stack, just push and pop accordingly
    public Stack() {
        //default size of 5
        this.items = 0;
        this.size = 5;
    }

    public Stack(int InitialStackSize) {
        //items = number of items currently stored in the stack
        //size = number of items stack can hold
        this.items = 0;
        this.size = InitialStackSize;
    }


    public boolean isEmpty() {
        if(this.items == 0) return true;
        else return false;
    }

    public boolean isFull() {
        //if # of items has reached size it is full
        return (this.size == this.items );
    }

    public void push(int data) {
        // if head node is null, make head and tail node contain the first node
        if (isEmpty()) {
            head = new Node(data);
            tail=head; // when first item is enqueued, head and tail are the same
            this.items++; // increment the number of items in the queue
        }
        else{
            if(isFull()) {
                this.size++;
                System.out.println("Increasing stack size");
            }
            Node<T> newNode = new Node(data);
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail=newNode;
            this.items++;

        }
    }

    public T pop() {
        T headDataValue = null;
        if ( !isEmpty() ) {
            headDataValue = head.getValue();
            Node<T> oldHead=head;
            head=head.getNext();
            oldHead.setNext(null);
            oldHead.setPrevious(null);
            this.items--;
            this.size--;
        }
        return headDataValue;  // returns the data value from the popped head, null if queue empty
    }
    public int getSize(){
        return this.size;
    }
    public int getItems(){
        return this.items;
    }
///////////////////Private Node Class ///////////////////////////
    //because arrays are whatever...
private class Node<T> {
    private T value;
    private Node _previous, _next;

    public Node(T data) {
        value = data;
        _previous = null;
        _next = null;
    }

    protected Node(T data, Node previousNode, Node nextNode) {
        value = data;
        _previous = previousNode;
        _next = nextNode;
    }

    public Node getNext() {
        return _next;
    }

    public Node getPrevious() {
        return _previous;
    }

    public void setValue(T newValue)
    {
        value=newValue;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node newNextNode) {
        _next = newNextNode;
    }

    public void setPrevious(Node newPreviousNode) {
        _next = newPreviousNode;
    }
}


}
