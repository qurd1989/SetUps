package tree;

import demo1.Tree;

public class TreeNode {
    protected int data;
    protected TreeNode left;
    protected TreeNode right;

    public TreeNode(int e){
       data = e;
       left = right = null;
       class BinaryTree{
           TreeNode root;

           BinaryTree(){
               root = null;
           }
       }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(60);
        root.left = new TreeNode(55);
        root.right = new TreeNode(100);
        System.out.println(search(root));
    }
    public static boolean search(TreeNode node){
        TreeNode current = node;
        while (current != null){
            if (node.data < current.data){
                current = current.left;
            }else if (node.data > current.data){
                current = current.right;
            }else
                return true;
        }
        return false;
    }
}

