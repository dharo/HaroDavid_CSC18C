package com.haro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String stackSz;
        int size;
        System.out.println("Assignment #5 Implement custom stack class");

        do {
            System.out.println("Default stack size is 5\nPlease enter a size for the Stack: ");
            stackSz = input.nextLine();
            size = Integer.valueOf(stackSz);
        }while(size<0);

        /////////////////////////////////// INTEGER STACK /////////////////////////
        System.out.println("Testing class with Integer");
        Stack<Integer> Integer_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing");
            Integer_stack.push(i+1);
        }
        System.out.println("Push extra value, exceeding size of stack");
        Integer_stack.push(23);

        System.out.println("isFull(): "+Integer_stack.isFull());
        System.out.println("isEmpty(): "+Integer_stack.isEmpty());
        System.out.println("# of items: "+Integer_stack.getItems());
        System.out.println("Size of stack: "+Integer_stack.getSize());

        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+Integer_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+Integer_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+Integer_stack.isFull());
        System.out.println("isEmpty(): "+Integer_stack.isEmpty());
        System.out.println("# of items: "+Integer_stack.getItems());
        System.out.println("Size of stack: "+Integer_stack.getSize());

        /*/////////////////// FLOAT STACK ////////////////////////////////////
        System.out.println("\n\nTesting Stack with Float");
        Stack<Float> Float_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing");
            Float_stack.push(i+1);
        }
        System.out.println("Push extra value, exceeding size of stack");
        Float_stack.push(23);

        System.out.println("isFull(): "+Float_stack.isFull());
        System.out.println("isEmpty(): "+Float_stack.isEmpty());

        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+Float_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+Float_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+Float_stack.isFull());
        System.out.println("isEmpty(): "+Float_stack.isEmpty());
*/
    }
}
