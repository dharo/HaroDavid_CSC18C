

package pkg18c_final;

/**
 *
 * Created by: David Haro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String infix =  "6 * (3+(7*8)*(5+2))";
       PostFix post = new PostFix();
       String expr;
       double result;
       
       expr = post.convertToPostFix(infix);
       result = post.evaluatePostFix(expr);
       
       System.out.println("Infix notation "+infix);
       System.out.println("PostFix notation of infix: "+expr);
       System.out.println("PostFix notation evaluates to: "+result);
    }

}