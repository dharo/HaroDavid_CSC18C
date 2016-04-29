package com.haro;

/**
 * Created by david on 4/28/16.
 *
 * Goal: Implement a method that grows the stack once the size is reached.
 *       Ideal implementation will use a linked list instead of an array.
 */
class Stack<T> {
    private Node<T> head=null;
    private int items;
    private int size;

    //automatically make only an empty stack, just push and pop accordingly
    public Stack() {
        //default size of 2
        this.items = 0;
        this.size = 2;
    }

    public Stack(int InitialStackSize) {
        //items = number of items currently stored in the stack
        //size = number of items stack can hold
        this.items = 0;
        this.size = InitialStackSize;
    }


    public boolean isEmpty() {
        return this.items == 0;
    }

    public boolean isFull() {
        //if # of items has reached size it is full
        if(this.items == 0) return false;
        return (this.size == this.items );
    }

    public T peek(){
        T top = null;

        if (head != null){
            top = head.getValue();
        }
        return top;
    }

    public void push (T data){
        if (isEmpty()) {
            head = new Node<T>(data);
            //tail=head; // when first item is enqueued, head and tail are the same
            this.items++; // increment the number of items in the queue
        }
        else{
            if(isFull()) {
                this.size++;
                System.out.println("Stack Limit reached: Increasing stack size");
            }
            Node top = new Node<T>(data);
            top.setNext(head);
            head = top;
            items++;
        }
    }

    public T pop(){
        T top = peek();
        if (head != null){
            head = head.getNext();
            items--;
            size--;
        }
        return top;
    }

    public int getSize(){
        //size = number of items stack can hold
        return this.size;
    }
    public int getItems(){
        //items = number of items currently stored in the stack
        return this.items;
    }
    public void display() {
        System.out.print("Current view of the stack: ");
        Node current=head;
        for(int i=0;i<items;i++) {
            System.out.print(current.getValue()+" ");
            current=current.getNext();
            if ( current==null ) break;
        }
        System.out.println();
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
