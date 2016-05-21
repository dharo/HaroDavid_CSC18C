import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class BinarySearchTree_template {

	public static void main(String[] args) {
		BinaryTree<Integer> IntTree    = new BinaryTree();
        BinaryTree<String>  StringTree = new BinaryTree();
        BinaryTree<Float>   FloatTree  = new BinaryTree();
        
        System.out.println("Templated Binary Search Tree Implementation");
        System.out.println("Integer Based BST");
        //Integer Binary Search Tree
        Random semi_rand_int = new Random();
        for(int i=1; i<=10;i++){
        	int ran_val = semi_rand_int.nextInt(100);
        	System.out.printf("Adding %d to IntTree\n",ran_val);
        	IntTree.add(ran_val);
        }
        
        System.out.print("pre-order traversal: ");
	    IntTree.preOrderTraversal();
	    System.out.print("in-order traversal: ");
	    IntTree.inOrderTraversal();
	    System.out.print("post-order traversal: ");
	    IntTree.postOrderTraversal();
	    System.out.println("\n-------------------------------------------\n");
        /////////////////////////////////////////////////////////////////////////////
        
	    System.out.println("String Based BST");
	    System.out.println("Strings are names which are read from a file...");
	    final String dir = System.getProperty("user.dir");
	    File file = new File(dir+"/names.txt");
	    System.out.println(dir+"/names.txt\n");
	    try {

	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.nextLine();
	            System.out.printf("Adding %s to StringTree\n", i);
	            StringTree.add(i);
	        }
	        sc.close();
	    } 
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	    System.out.print("pre-order traversal: ");
	    StringTree.preOrderTraversal();
	    System.out.print("in-order traversal: ");
	    StringTree.inOrderTraversal();
	    System.out.print("post-order traversal: ");
	    StringTree.postOrderTraversal();
	    System.out.println("\n-------------------------------------------\n");
	    /////////////////////////////////////////////////////////////////////////////
	    System.out.println("Float Based BST");
	    
	    for(int i=1; i<=10;i++){
	    	Float ran_flt = semi_rand_int.nextFloat();
        	System.out.printf("Adding %f to FloatTree\n",ran_flt);
        	FloatTree.add(ran_flt);
        }
	    
	    System.out.print("pre-order traversal: ");
	    FloatTree.preOrderTraversal();
	    System.out.print("in-order traversal: ");
	    FloatTree.inOrderTraversal();
	    System.out.print("post-order traversal: ");
	    FloatTree.postOrderTraversal();
	    System.out.println("\n-------------------------------------------\n");

	}

}
