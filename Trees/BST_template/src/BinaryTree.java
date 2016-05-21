


public class BinaryTree {
    
    private TreeNode root;
    
    public BinaryTree()
    {
        root = null;
    }
    
    public void add(int data_item)
    {
        root = insertNode(data_item,root);
    }
    
    private TreeNode insertNode(int item, TreeNode subRoot)
    {
        if ( subRoot == null ) // tree is empty
        {
            return new TreeNode(item,null,null);
        }
        else if ( item < subRoot.getData() ) // if item is less than subRoot's data item, traverse left
        {
            subRoot.setLeftNode(insertNode(item,subRoot.getLeftNode()));
            return subRoot;
        }
        else
        {
            subRoot.setRightNode(insertNode(item,subRoot.getRightNode()));
            return subRoot;
        }
    }
    
    public boolean contains(int search_value)
    {
        return checkInTree(search_value,root);
    }
    
    private boolean checkInTree(int sv, TreeNode subRoot)
    {
        if ( subRoot == null ) return false;
        else if ( subRoot.getData()==sv) return true;
        else if ( sv < subRoot.getData() ) return checkInTree(sv, subRoot.getLeftNode());
        else return checkInTree(sv, subRoot.getRightNode());
    }
    
    ////////////////////////////////////////////////////////////////////
    // methods for preorder, inorder, and postorder traversals
    ////////////////////////////////////////////////////////////////////
    
    public void preOrderTraversal()
    {
        this.preOrder(root);       
        System.out.println();
    }
    
    private void preOrder(TreeNode currentNode)
    {
        if (currentNode == null) 
        {            
            return;
        }
        
        System.out.print(currentNode.getData()+" ");
        this.preOrder(currentNode.getLeftNode());
        this.preOrder(currentNode.getRightNode());
    }
    
    public void inOrderTraversal()
    {
        this.inOrder(root);       
        System.out.println();
    }
    
    private void inOrder(TreeNode currentNode)
    {
        if (currentNode == null) 
        {            
            return;
        }
        
        this.inOrder(currentNode.getLeftNode());
        System.out.print(currentNode.getData()+" ");
        this.inOrder(currentNode.getRightNode());
    }
    
    public void postOrderTraversal()
    {
        this.postOrder(root);       
        System.out.println();
    }
    
    private void postOrder(TreeNode currentNode)
    {
        if (currentNode == null) 
        {            
            return;
        }
        
        this.postOrder(currentNode.getLeftNode());
        this.postOrder(currentNode.getRightNode());
        System.out.print(currentNode.getData()+" ");        
    }
    
    ////////////////////////////////////////////////////////////////////
    private class TreeNode
    {
        private int data;
        private TreeNode leftNode;
        private TreeNode rightNode;
        
        public TreeNode(int newData, TreeNode left, TreeNode right)
        {
            this.data=newData;
            this.leftNode=left;
            this.rightNode=right;
        }

        /**
         * @return the data
         */
        public int getData() {
            return data;
        }

        /**
         * @param data the data to set
         */
        @SuppressWarnings("unused")
		public void setData(int data) {
            this.data = data;
        }

        /**
         * @return the leftNode
         */
        public TreeNode getLeftNode() {
            return leftNode;
        }

        /**
         * @param leftNode the leftNode to set
         */
        public void setLeftNode(TreeNode leftNode) {
            this.leftNode = leftNode;
        }

        /**
         * @return the rightNode
         */
        public TreeNode getRightNode() {
            return rightNode;
        }

        /**
         * @param rightNode the rightNode to set
         */
        public void setRightNode(TreeNode rightNode) {
            this.rightNode = rightNode;
        }      
    } // end of TreeNode inner class
}
