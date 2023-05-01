package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    int[] solve(PostorderTraversal A){

        if (A == null) {
            return new int[0];
        }

        List<Integer> list  = new ArrayList<>();
        Stack<PostorderTraversal> stack = new Stack<>();

        stack.add(A);

        while (!stack.isEmpty()) {

            PostorderTraversal curr = A;
            if (curr != null) {
                stack.add(curr.left);
                list.add(curr.val);
                stack.add(curr.right);

            }

        }

        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
