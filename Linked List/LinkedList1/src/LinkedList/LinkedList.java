package LinkedList;

public class LinkedList {

    // head node
    private Node head;
    // keep track of number of items in linked list
    private int listCount;

    // default constructor to create an empty linked list
    public LinkedList() {
        head = new Node();
        listCount = 0;
    }

    // add a node with the specified element to the end of this list
    public void add(int dataValue) 
    {
        Node temp = new Node(dataValue);
        Node current = head;
        // start at the head node, loop to the end of the list
        //while (current.getNext() != null) {
        //    current = current.getNext();
        //}
        current = getLastNode(current);
        
        // when we reach the end of our current list, set the current node's next
        // "pointer" to temp
        current.setNext(temp);
        // increment our counter for number of elements in linked list
        listCount++;
    }

    public Node getLastNode(Node list){
        while (list.getNext() != null){
            list = list.getNext();
        }
        return list;
    }
    // inserts the specified element at the specified position in this list
    public void add(int dataValue, int indexPosition) 
    {
        Node temp = new Node(dataValue);
        Node current = head;
        // iterate to our indexPosition or the last element in the 
        // linked list ( whichever one comes first)
        for (int i = 0; i < indexPosition && current.getNext() != null; i++) {
            current = current.getNext();
        }
        // we get the current node's next "pointer", and set temp node's next "pointer"
        // to that value
        temp.setNext(current.getNext());
        // set our current node's next "pointer" to the temp node
        current.setNext(temp);
        // increment our counter for number of elements in linked list
        listCount++;
    }

    // returns the element at the specified index position in this list
    public int get(int indexPosition)
    {
        // index must be 0 or higher
        if (indexPosition < 0) {
            throw new IllegalArgumentException();
        }

        Node current = head.getNext();
        for (int i = 0; i < indexPosition; i++) {
            if (current.getNext() == null) {
                return 0;
            }

            current = current.getNext();
        }
        return current.getData();
    }

    // removes the node at the specified index position in this list
    public boolean remove(int indexPosition) 
    {
        // if the index is out of range, exit
        if (indexPosition < 0 || indexPosition > size()) {
            return false;
        }

        Node current = head;
        for (int i = 0; i < indexPosition; i++) {
            if (current.getNext() == null) {
                return false;
            }

            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        // decrement the number of elements variable
        listCount--; 
        return true;
    }

    // returns the number of items (elements) in the linked list
    public int size()
    {
        return listCount;
    }

    // utility method to print out items in linked list
    @Override
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData() + "]";
            current = current.getNext();
        }
        return output;
    }

    // this is a private inner class, only needs to be used by the
    // public outer linkedlist class
    private class Node {
        // next node in the linked list, if null, then end of list

        Node next;
        // data element of the node
        int data;

        // constructor to create node with empty value
        public Node() {
            next = null;
            data = 0;
        }

        // constructor to create node with a value in the node
        public Node(int dataValue) {
            next = null;
            data = dataValue;
        }

        // constructor for if we want to specify a particular node for
        // the node to point to
        public Node(int dataValue, Node nextNode) {
            next = nextNode;
            data = dataValue;
        }

        // return the data in the node
        public int getData() {
            return data;
        }

        // set the data in the node to a value
        public void setData(int dataValue) {
            data = dataValue;
        }

        // returns the next node, if any
        public Node getNext() {
            return next;
        }

        // set the next node to point to some other node
        public void setNext(Node nextNode) {
            next = nextNode;
        }
    }
}
