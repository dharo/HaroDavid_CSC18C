public class QueueTest
{
	public static void main(String[] args)
	{
		Queue<Integer> queue_of_integers = new Queue();

		System.out.println("Demonstrating queue_of_integers...");
		System.out.println("Calling push_back(5)...");
		queue_of_integers.push_back(5);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(2)...");
		queue_of_integers.push_back(2);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(12)...");
		queue_of_integers.push_back(12);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(8)...");
		queue_of_integers.push_back(8);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();		
		System.out.printf("\n");
		System.out.println("Calling enqueue(105)...");
		queue_of_integers.enqueue(105);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(102)...");
		queue_of_integers.enqueue(102);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(112)...");
		queue_of_integers.enqueue(112);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(108)...");
		queue_of_integers.enqueue(108);
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();		
		System.out.printf("\n\n");		
		
		System.out.printf("Current value at front: %d, current value at end: %d\n\n",queue_of_integers.front(),queue_of_integers.back());
		
		System.out.println("Calling pop_front()...");
		System.out.printf("Return value: %d\n", queue_of_integers.pop_front());
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling dequeue()...");
		System.out.printf("Return value: %d\n", queue_of_integers.dequeue());
		System.out.print("Content of queue_of_integers: ");
		queue_of_integers.display();		
		System.out.printf("\n\n");
		
		Queue<Double> queue_of_doubles = new Queue();

		System.out.println("Calling push_back(0.5)...");
		queue_of_doubles.push_back(0.5);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(2.2)...");
		queue_of_doubles.push_back(2.2);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(1.2)...");
		queue_of_doubles.push_back(1.2);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling push_back(-0.8)...");
		queue_of_doubles.push_back(-0.8);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();		
		System.out.printf("\n");
		System.out.println("Calling enqueue(1.05)...");
		queue_of_doubles.enqueue(1.05);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(10.2)...");
		queue_of_doubles.enqueue(10.2);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(-1.12)...");
		queue_of_doubles.enqueue(-1.12);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling enqueue(0.108)...");
		queue_of_doubles.enqueue(0.108);
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();		
		System.out.printf("\n\n");		
		
		System.out.printf("Current value at front: %f, current value at end: %f\n\n",queue_of_doubles.front(),queue_of_doubles.back());
		
		System.out.println("Calling pop_front()...");
		System.out.printf("Return value: %f\n", queue_of_doubles.pop_front());
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();
		System.out.printf("\n");
		System.out.println("Calling dequeue()...");
		System.out.printf("Return value: %f\n", queue_of_doubles.dequeue());
		System.out.print("Content of queue_of_doubles: ");
		queue_of_doubles.display();		
		System.out.printf("\n\n");
	}
}