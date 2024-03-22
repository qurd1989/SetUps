package tree;




public class HeightOfTree {
    public static void main(String[] args) {
        BinaryTree.TreeNode binaryTree = new BinaryTree.TreeNode(1);

        /**
         * Binary Tree in our example, height = 2
         * 		1		(Root)
         * 	  2	  3		(Level 1)
         *  4    	 5		(Level 2)
         */
        //binaryTree.root = new TreeNode(1);
        binaryTree.left = new BinaryTree.TreeNode(2);
        binaryTree.right = new BinaryTree.TreeNode(3);
        binaryTree.left.left = new BinaryTree.TreeNode(4);
        binaryTree.right.left = new BinaryTree.TreeNode(5);

        System.out.println(height(binaryTree));

    }

    public static int height(BinaryTree.TreeNode root){
        if (root == null){
            return 0;
        }
        return 1 + height(root.left) + height(root.right);
    }

}
