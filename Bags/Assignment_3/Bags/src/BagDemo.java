
import java.util.Random;
import java.util.Scanner;

public class BagDemo {

    public static void main(String[] args) {
        //recieve input
        Scanner input = new Scanner(System.in);
        String choice;
        boolean order = true;
        //lets use a random number generator
        Random rand = new Random();
        
        Integer numberOfelement;
        
        Bag<String> bag_of_strings = new Bag();
        Bag<Integer> bag_of_ints = new Bag();
        Bag<Float> bag_of_floats = new Bag();
        
        //merge sort use
//        Bag<String> bag_sorted_strings = new Bag();
//        Bag<Integer> bag_sorted_ints = new Bag();
//        Bag<Float> bag_sorted_floats = new Bag();
        
        //fill bag with random numbers
        for(int i=5;i>0;i--){
            numberOfelement = rand.nextInt(50);
            bag_of_strings.add(numberOfelement.toString());
            bag_of_ints.add(numberOfelement);
            bag_of_floats.add(numberOfelement.floatValue());
        }
        System.out.println("David Haro CSC 18C Java Data Structures");
        System.out.println("Assignment # 3");
        System.out.println("Merge and Selection Sort");
        System.out.println("This program will sort using both, first it will implement");
        System.out.println("the sort-order of your choosing with MERGE SORT and then ");
        System.out.println("re-sort the list/bag backwards using another sorting method.\n\n");
        do{
            System.out.println("How would you like to sort:");
            System.out.println("1. Sort from Smallest to Largest");
            System.out.println("2. Sort from Largest to Smallest");
            System.out.println("3. Quit");
        
            choice = input.nextLine();
        }while (choice.equalsIgnoreCase("1")==false && 
                choice.equalsIgnoreCase("2")==false && 
                choice.equalsIgnoreCase("3")==false);
        
        
        switch (choice) {
            case "1":
                order = true;
                break;
            case "2":
                order = false;
                break;
            case "3":
                return;
            default:
                break;
        }
        
        //Bag of Strings
        //System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("UNSORTED bag_of_strings:");
        Object[] strings = bag_of_strings.toArray();
        for(int i=0;i<strings.length;i++) {
            System.out.printf("unsorted_strings[%d]=%s\n",i,strings[i]);
        }       
        //print merge sorted
        //Object[] mrg_sorted = bag_sorted_strings.mergeSort(order, bag_of_strings.toArray());
        
        Object[] mrg_sorted = bag_of_strings.mergeSort(order);
        System.out.println("Printing MERGE SORTED bag...");
        for(int i=0;i<bag_of_strings.getSize();i++) {
            System.out.printf("mrg_sorted_strings[%d]=%s\n",i,mrg_sorted[i]);
        }
        bag_of_strings.selSort(!order);
        System.out.println("Printing SELECTION SORTED bag (opposite order)");
        strings = bag_of_strings.toArray();
        for(int i=0;i<strings.length;i++) {
            System.out.printf("sel_sorted_strings[%d]=%s\n",i,strings[i]);
        }
        System.out.println("\n");
        
        
        //Bag of Ints
        //System.out.println("Size of bag_of_ints=" + bag_of_ints.getSize() );
        System.out.println("UNSORTED bag_of_ints:");
        Object[] ints = bag_of_ints.toArray();
        for(int i=0;i<ints.length;i++) {
            System.out.printf("unsorted_ints[%d]=%s\n",i,ints[i]);
        }       
        
        //print merge sorted
        //mrg_sorted = bag_sorted_ints.mergeSort(order,bag_of_ints.toArray());
        mrg_sorted = bag_of_ints.mergeSort(order);
        
        System.out.println("Now printing MERGE SORTED bag...");
        for(int i=0;i<mrg_sorted.length;i++) {
            System.out.printf("merge_sorted_ints[%d]=%s\n",i,mrg_sorted[i]);
        }
        
        bag_of_ints.selSort(!order);
        System.out.println("Printing SELECTION SORTED bag (opposite order)");
        ints = bag_of_ints.toArray();
        for(int i=0;i<ints.length;i++) {
            System.out.printf("sel_sorted_ints[%d]=%s\n",i,ints[i]);
        }
        System.out.println("\n");
        
        
        
        //Bag of Floats
        //System.out.println("Size of bag_of_floats=" + bag_of_floats.getSize() );
        System.out.println("UNSORTED bag_of_floats:");
        Object[] floats = bag_of_floats.toArray();
        for(int i=0;i<floats.length;i++) {
            System.out.printf("unsorted_floats[%d]=%s\n",i,floats[i]);
        }       
       
        //mrg_sorted = bag_sorted_floats.mergeSort(order,bag_of_floats.toArray());
        
        //improved implementation
        mrg_sorted = bag_of_floats.mergeSort(order);
        
        System.out.println("Now printing MERGE SORTED bag...");
        //floats = bag_of_floats.toArray();
        for(int i=0;i<mrg_sorted.length;i++) {
            System.out.printf("merge_floats[%d]=%s\n",i,mrg_sorted[i]);
        }
        bag_of_floats.selSort(!order);
        System.out.println("Printing SELECTION SORTED bag (opposite order)");
        floats = bag_of_floats.toArray();
        for(int i=0;i<floats.length;i++) {
            System.out.printf("sel_sorted_floats[%d]=%s\n",i,floats[i]);
        }
        System.out.println("\n");
        
    }
    
}
