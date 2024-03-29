package tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(InorderTraversal root) {

        Queue<InorderTraversal> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null){
            return list;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer>  subList = new LinkedList<>();
            for (int i = 0 ; i < level; i++){
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                subList.add(queue.poll().val);
            }
            list.add(subList);
        }
        return list;
    }

}
