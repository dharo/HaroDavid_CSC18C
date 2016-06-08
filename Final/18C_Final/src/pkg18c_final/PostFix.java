/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18c_final;

/**
 *
 * @author d
 */
public class PostFix {
    
    public String convertToPostFix(String infix){
        
        Stack<Character> s = new Stack();
        String postFix = "";
        
        for(int i=0;i<infix.length();i++){
            if(isOperand(infix.charAt(i)))
                postFix+=infix.charAt(i);
            if(infix.charAt(i) == '(')
                s.push(infix.charAt(i));
            if(infix.charAt(i) == ')'){
                while(s.peek() != '('){
                    postFix+=s.pop();
                }
                s.pop();
            }
            if(isOperator(infix.charAt(i))){
                while(!s.isEmpty() && s.peek() != '(' && precedence(infix.charAt(i)) <= precedence(s.peek())){
                    postFix+=s.pop();
                }
                s.push(infix.charAt(i));
            }    
        }
        while(!s.isEmpty()){
            postFix+=s.pop();
        }
        return postFix;
    }
    
    public double evaluatePostFix(String expr){
        Stack<Double> s = new Stack();
        for(int i=0;i<expr.length();i++){
            if(isOperand(expr.charAt(i)))
                s.push(Double.parseDouble(Character.toString(expr.charAt(i))));
            if(isOperator(expr.charAt(i))){
                System.out.println("Operand1 = "+s.peek());
                double operand1 = s.pop();
                System.out.println("Operand2 = "+s.peek());
                double operand2 = s.pop();
                double result = doTheMath(expr.charAt(i),operand1,operand2);
                System.out.println("result = "+s.peek());
                s.push(result);
                System.out.println("Result pushed to stack = "+s.peek());
            }
        }
        return s.pop();
    }
    
    
    private double doTheMath(char oper, double op1, double op2){
        String operat = Character.toString(oper);
        if("*".equals(operat))
            return op1*op2;
        else if("/".equals(operat))
            return op1/op2;
        else if("+".equals(operat))
            return op1+op2;
        else
            return op1-op2;
    }
    
    
    private boolean isOperand(char c){
        String value = Character.toString(c);
        return     "1".equals(value) || "2".equals(value) || "3".equals(value)
                || "4".equals(value) || "5".equals(value)|| "6".equals(value)
                || "7".equals(value) || "8".equals(value) || "9".equals(value)
                || "0".equals(value);
    }
    
    private boolean isOperator(char c){
        String value = Character.toString(c);
        return     "^".equals(value) || "*".equals(value) || "/".equals(value)
                || "+".equals(value) || "-".equals(value);
    }
    
    private int precedence(char input){
        int heirarchy = -1;
        
        if(input == '*' || input == '/')
            heirarchy = 4;
        if(input == '+' || input == '-')
            heirarchy = 2;
        
        return heirarchy;
    }
    
    
    
    
    
    
    
        private class Stack<T> {
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
                    //System.out.println("Stack Limit reached: Increasing stack size");
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
}