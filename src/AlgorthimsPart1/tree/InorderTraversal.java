package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


//Given a binary tree, return the inorder traversal of its nodes' values.
public class InorderTraversal {

    int val;
    InorderTraversal left;
    InorderTraversal right;
    InorderTraversal(int x) {
      val = x;
       left=null;
      right=null;
      }

    public static void main(String[] args) {

    }

    class solution {

        public static int[] solve(InorderTraversal A) {

            List<Integer> res = new ArrayList<>();
            Stack<InorderTraversal> st = new Stack<InorderTraversal>();


            if(A ==null) {
                return new int[0];
            }

            InorderTraversal curr = A;
            while (A != null|| !st.isEmpty()) {

                while (curr !=  null) {
                    st.push(curr);
                     curr = curr.left;

                }
                curr = st.pop();
                res.add(curr.val);
                curr = curr.right;

            }

            int[] reuslt = new int[res.size()];
            for (int i =0; i < res.size(); i++) {
                reuslt[i] = res.get(i);
            }
        return reuslt;
        }


    }
}
