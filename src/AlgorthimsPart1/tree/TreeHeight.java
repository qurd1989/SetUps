package tree;

//You are given the root node of a binary tree A. You have to find the height of the given tree.

//A binary tree's height is the number of nodes along the longest path from the root node down to the farthest leaf node.

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.ExpressionTree;
import com.sun.source.tree.TreeVisitor;
import demo1.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeight {
    int val;
    TreeHeight left;
    TreeHeight right;

    TreeHeight(int x) {
        val = x;
        left = null;
        right = null;
    }

    static class BinaryTree {

        TreeHeight root;

        int solveHieght(TreeHeight A) {

            if (A == null) {
                return 0;

            }
            int lDepth = solveHieght(A.left);
            int rDepth = solveHieght(A.right);


            if (lDepth > rDepth) {
                return (lDepth + 1);

            } else
                return (rDepth + 1);
        }

        int calculateHeight(TreeHeight root) {
            if (root == null) {
                return 0;
            }

            Queue<TreeHeight> queue = new LinkedList<>();
            queue.offer(root);
            int height = 0;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();

                for (int i = 0; i < levelSize; i++) {
                    TreeHeight node = queue.poll();
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                height++;
            }

            return height;
        }


    }

        public static void main(String[] args) {

            BinaryTree bt = new BinaryTree();

            bt.root = new TreeHeight(1);
            bt.root.left = new TreeHeight(2);
            bt.root.left.right = new TreeHeight(3);

            System.out.println("Height of tree is " + bt.solveHieght(bt.root));
            System.out.println("Height of tree is " + bt.calculateHeight(bt.root));

        }



}
