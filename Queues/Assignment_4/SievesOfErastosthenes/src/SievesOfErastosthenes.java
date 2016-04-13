import java.util.Scanner;

/**
 *
 * Created by: David Haro
 * 
 */
public class SievesOfErastosthenes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user_in;
        //Initialize Queues, integers will work
        Queue<Integer> QoZ = new Queue();
        Queue<Integer> QoP = new Queue();
        
        //prompt for input
        do{
            System.out.println("Please input the size of the set of Integers (Z)");
            System.out.println("where you'd like to search for the set of Primes (P)");
            user_in = input.nextInt();
            if(user_in < 3) System.out.println("Try a larger number...");
        }while(user_in < 3);
        
        //fill the integer queue with values from 2 to user_input (size of n)
        for(int i=2;i<=user_in;i++){
            QoZ.enqueue(i);
        }
        
        do{
            boolean endOfQ = false;
            //grab prime waiting at front of QoZ
            QoP.push_back(QoZ.pop_front());
            System.out.println("\nPushing new Prime: "+QoP.back());
            
            System.out.print("\nQueue of P: ");
            QoP.display();
            
            System.out.print("\nQueue of Z: ");
            QoZ.display();         

            //if value at front of QoZ is multiple of the last prime, remove it 
            //from QoZ
            int current_front = QoZ.front();
            do{
                if(QoZ.front() % QoP.back() == 0){  //if multiple exists, remove it
                    QoZ.pop_front();
                }
                if(QoZ.front() % QoP.back() != 0){  //if not a multiple of current prime
                    QoZ.push_back(QoZ.pop_front()); //push_back to QoZ
                }
                if(QoZ.front() == current_front){   //check if we are back to the
                    endOfQ = true;                  //start
                }
            }while(!endOfQ);
   
        }while(Math.sqrt(user_in)>QoP.back());

        do{
            QoP.push_back(QoZ.pop_front());
        }while(!QoZ.isEmpty());
        System.out.print("\nQueue of Primes: ");
        QoP.display();
    }

}
