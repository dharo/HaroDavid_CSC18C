package bin_tree;

//  Binary Tree						Tree Node
// ----------------------|		-data      :   int
//  -root: TreeNode				-leftNode  :  TreeNode
// ----------------------|		-rightNode : TreeNode
//  +add (int)
//  +preOrderTraversal()
//  +inOrderTraversal()
//  +postOrderTraversal()
//


public class BinarySearchTree {

	public static void main(String[] args) {
		BinaryTree myTree = new BinaryTree();
		
		myTree.add(8);
		myTree.add(12);
		myTree.add(6);
		myTree.add(5);
		myTree.add(9);
		myTree.add(13);
		myTree.add(11);
		myTree.add(10);
		myTree.add(7);
		
//		for(int i=0;i<15;i++){
//			System.out.printf("myTree.contains(%d) returned %s \n",i,myTree.contains(i));
//		}
		System.out.println("Pre-Order Traversal: ");
		myTree.preOrderTraversal();
		
		System.out.println("\nIn-Order Traversal: ");
		myTree.inOrderTraversal();
		
		System.out.println("\nPost-Order Traversal: ");
		myTree.postOrderTraversal();
	}

}
