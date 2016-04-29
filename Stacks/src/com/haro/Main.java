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
            System.out.println("Default stack size is 2\nPlease enter a size for the Stack: ");
            stackSz = input.nextLine();
            size = Integer.valueOf(stackSz);
        }while(size<0);

        /////////////////////////////////// INTEGER STACK /////////////////////////
        System.out.println("Testing class with Integer");
        Stack<Integer> Integer_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing: "+ (i+1));
            Integer_stack.push(i+1);
        }
        System.out.println("Push extra value, exceeding size of stack");
        Integer_stack.push(23);

        System.out.println("isFull(): "+Integer_stack.isFull());
        System.out.println("isEmpty(): "+Integer_stack.isEmpty());
        System.out.println("# of items: "+Integer_stack.getItems());
        System.out.println("Size of stack: "+Integer_stack.getSize());

        //display stack
        Integer_stack.display();

        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+Integer_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+Integer_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+Integer_stack.isFull());
        System.out.println("isEmpty(): "+Integer_stack.isEmpty());
        System.out.println("# of items: "+Integer_stack.getItems());
        System.out.println("Size of stack: "+Integer_stack.getSize());

        /////////////////// FLOAT STACK ////////////////////////////////////
        System.out.println("\n\nTesting Stack with Float");
        Stack<Float> Float_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing: "+ (i+1));
            Float_stack.push(Float.parseFloat(String.valueOf(i+1)));
        }
        System.out.println("Push extra value, exceeding size of stack");
        Float_stack.push(Float.parseFloat(String.valueOf(23)));

        System.out.println("isFull(): "+Float_stack.isFull());
        System.out.println("isEmpty(): "+Float_stack.isEmpty());
        System.out.println("# of items: "+Float_stack.getItems());
        System.out.println("Size of stack: "+Float_stack.getSize());

        //display stack
        Float_stack.display();

        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+Float_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+Float_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+Float_stack.isFull());
        System.out.println("isEmpty(): "+Float_stack.isEmpty());
        System.out.println("# of items: "+Float_stack.getItems());
        System.out.println("Size of stack: "+Float_stack.getSize());

        /////////////////// DOUBLE STACK ////////////////////////////////////
        System.out.println("\n\nTesting Stack with Double");
        Stack<Double> Double_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing: "+ (i+1));
            Double_stack.push(Double.parseDouble(String.valueOf(i+1)));
        }
        System.out.println("Push extra value, exceeding size of stack");
        Double_stack.push(Double.parseDouble(String.valueOf(23)));

        System.out.println("isFull(): "+Double_stack.isFull());
        System.out.println("isEmpty(): "+Double_stack.isEmpty());
        System.out.println("# of items: "+Double_stack.getItems());
        System.out.println("Size of stack: "+Double_stack.getSize());

        Double_stack.display();
        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+Double_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+Double_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+Double_stack.isFull());
        System.out.println("isEmpty(): "+Double_stack.isEmpty());

        /////////////////// String STACK ////////////////////////////////////
        System.out.println("\n\nTesting Stack with String");
        Stack<String> String_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing: "+ (i+1));
            String_stack.push(String.valueOf(i+1));
        }
        System.out.println("Push extra value, exceeding size of stack");
        String_stack.push(String.valueOf(23));

        System.out.println("isFull(): "+String_stack.isFull());
        System.out.println("isEmpty(): "+String_stack.isEmpty());
        System.out.println("# of items: "+String_stack.getItems());
        System.out.println("Size of stack: "+String_stack.getSize());

        String_stack.display();
        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+String_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+String_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+String_stack.isFull());
        System.out.println("isEmpty(): "+String_stack.isEmpty());

        /////////////////// Random STACK ////////////////////////////////////
        System.out.println("\n\nTesting Stack with Object class");
        Stack<Object> random_stack = new Stack();

        //Fill the stack
        for(int i = 0;i<size;i++){
            System.out.println("Pushing: "+ (i+1));
            random_stack.push(String.valueOf(i+1));
        }
        System.out.println("Push extra value, exceeding size of stack");
        random_stack.push(String.valueOf(23));

        System.out.println("isFull(): "+random_stack.isFull());
        System.out.println("isEmpty(): "+random_stack.isEmpty());
        System.out.println("# of items: "+random_stack.getItems());
        System.out.println("Size of stack: "+random_stack.getSize());

        random_stack.display();
        //print the stack
        for(int i = 0;i<size;i++)System.out.println("Popping item: "+random_stack.pop());
        //pop again after we popped all the items
        System.out.println("Popping item: "+random_stack.pop());
        //Check if stack is full/empty
        System.out.println("isFull(): "+random_stack.isFull());
        System.out.println("isEmpty(): "+random_stack.isEmpty());
    }

}
