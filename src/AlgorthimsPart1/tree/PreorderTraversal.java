package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

//    Given a binary tree, return the preorder traversal of its nodes values.
    int val;
     PreorderTraversal left;
      PreorderTraversal right;
      PreorderTraversal(int x) {
          val = x;
          left = null;
          right = null;


      }
    public static void main(String[] args) {

    }
    public class Solution {
        public List<Integer> preorderTraversal(PreorderTraversal A) {

            List<Integer> res = new ArrayList<>();
            Stack<PreorderTraversal> stack = new Stack<>();

            stack.add(A);
            while (!stack.isEmpty()){

                PreorderTraversal curr = stack.peek();
                stack.pop();
                if (curr != null) {
                    res.add(curr.val);
                    stack.add(curr.right);
                    stack.add(curr.left);
                }
            }
            return res;
            }
        }
    }

