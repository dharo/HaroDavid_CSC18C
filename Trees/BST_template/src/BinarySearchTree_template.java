
public class BinarySearchTree_template {

	public static void main(String[] args) {
BinaryTree myTree = new BinaryTree();
        
        // insert 8,12,6,5,9,13,11,10,7 into tree
        
        //myTree.add(8);
        //myTree.add(12);
        //myTree.add(6);
        //myTree.add(5);
        //myTree.add(9);
        //myTree.add(13);
        //myTree.add(11);
        //myTree.add(10);
        //myTree.add(7);
        
        //for(int i=0;i<15;i++)
        //    System.out.printf("myTree.contains(%d) returned: %s\n",i,myTree.contains(i));
        System.out.println("Enter an integer value and I will add it to the tree, and after");
        System.out.println("adding it to the tree, I'll do the pre-order, in-order, and post-order");
        System.out.println("traversals of what you have given me....");
        
        while(true)
        {
            System.out.print("Enter an integer: ");
            int value = new java.util.Scanner(System.in).nextInt();
            myTree.add(value);
        
            System.out.print("pre-order traversal: ");
            myTree.preOrderTraversal();
            System.out.print("in-order traversal: ");
            myTree.inOrderTraversal();
            System.out.print("post-order traversal: ");
            myTree.postOrderTraversal();
        }

	}

}
