

package assignment_2_analysis;

/**
 *
 * Created by: David Haro
 * 
 */
public class Assignment_2_analysis {

 static int count;
    
    public static void function_one(int n)
    {
        count++;
        System.out.print(n+" ");
        if ( n > 1 )
        {
            function_one(n-1);
            function_one(n-1);
        }
    }
    
    public static void function_two(int n)
    {
        count++;
        System.out.print(n+" ");
        if ( n > 1 )
        {
            function_two(n-1);
            function_two(n/2);
        }
    }
    
    public static int function_three(int n)
    {
        count++;
        System.out.print(n+" ");
        if ( n > 1 )
        {
            return function_three(n/2)+function_three(n/2);
        }
        return 1;
    }
    
	public static void count_down(int n)
	{
            //count++;
            System.out.println(n);
            if ( n > 1 ){
                count++;
                count_down(n/2);
            }
	}
	
    public static void main(String[] args) {
        
        System.out.println("Function One  BigO (2^2 - 1)");
        for(int i=1;i<10;i++)
        {
            count=0;
            function_one(i);
            System.out.printf("n=%d, count=%d\n", i,count);
        }
        
        System.out.println("Function Two");
        for(int i=1;i<=10;i++)
        {
            count=0;
            function_two(i);
            System.out.printf("n=%d, count=%d\n", i,count);
        }
        
        System.out.println("Function Three");
        for(int i=1;i<=500000;i++)
        {
            count=0;
            function_three(i);
            System.out.printf("n=%d, count=%d\n", i,count);
        }
        
        System.out.println("Count Down");
        for(int i=1;i<=100;i++)
        {
            count=0;
            count_down(i);
            System.out.printf("n=%d, count=%d\n", i,count);
        }
    }   

}
