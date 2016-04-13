public class Queue<T> implements QueueInterface<T>
{
	// linked list containing the items in the queue
	private Node<T> head=null, tail=null;
	
	// current number of items in queue
	private int numberOfItems;
	
	// Queue constructor that starts with empty queue.
	public Queue()
	{
		numberOfItems=0; // no items yet!
	}
	
	// displays current contents of the queue
	public void display()
	{
		Node current=head;
		for(int i=0;i<numberOfItems;i++)
		{
			System.out.print(current.getValue()+" ");
			current=current.getNext();
			if ( current==null ) break;
		}
	}
	
	// ----- functions/methods in the interface that must be implemented -----
	
	
	// -----------------------------------------------------------------------
	
	// Node Inner Class
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