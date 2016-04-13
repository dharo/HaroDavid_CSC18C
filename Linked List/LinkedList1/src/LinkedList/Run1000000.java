/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Paul
 */
public class Run1000000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        // add a nodes with the dataValues of 1 to 1,000,000
        for (int i=1;i<=10;i++)
            test.add(i);
        
        System.out.println(test.toString());
        test.add(23);
        System.out.println(test.toString());
    }
    
}
