package tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class PostorderTraversal {
    int val;
    PostorderTraversal left;
    PostorderTraversal right;

    PostorderTraversal(int x) {
        val =x;
        right =null;
        left = null;

    }
    public static void main(String[] args) {

    }

   public ArrayList<Integer> postorderTraversal(Node A){
       ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Stack<Node> stack1 = new Stack<>();
        if (A == null){
            return list;
        }

        stack.push(A);
        Node curr = A;
        while ( !stack.isEmpty()){

            A = stack.peek();
            stack.pop();
            stack1.push(curr);
            if (A.left != null){
                stack1.push(A);
            }
            if (A.right != null){
                stack1.push(A);
            }
            while (!stack1.isEmpty()) {
                list.add(stack1.peek().data);
                stack1.pop();
            }
        }
        return list;
   }

}
