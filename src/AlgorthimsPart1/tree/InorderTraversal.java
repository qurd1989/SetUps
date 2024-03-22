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
        left = null;
        right = null;
    }

    public static void main(String[] args) {

    }

    class solution {

        public static ArrayList<Integer> solve(InorderTraversal A) {

            ArrayList<Integer> inOrder = new ArrayList<>();
            Stack<InorderTraversal> s = new Stack<>();
            while (true) {
                if (A != null) {
                    s.push(A);
                    A = A.left;
                } else {
                    if (s.isEmpty()) break;
                    A = s.peek();
                    inOrder.add(A.val);
                    s.pop();
                    A = A.right;
                }
            }
            return inOrder;
        }
    }
    }
