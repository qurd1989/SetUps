package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFS {

    static List<Integer> dfsOrder = new ArrayList<>();

    public static void dfs(int node, List<ArrayList<Integer>> tree) {
        // Visit the current node
        dfsOrder.add(node);

        // Explore unvisited children
        for (int child : tree.get(node)) {
            if (!dfsOrder.contains(child)) { // Check if child is not visited yet
                dfs(child, tree);
            }
        }
    }
static void main(String[] args) {
        // Sample input (replace with actual input logic)
        int N = 10;
        List<ArrayList<Integer>> tree = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            tree.add(new ArrayList<>());
        }
        // Add edges as per the input format (replace with actual logic)
        tree.get(1).add(2);
        tree.get(1).add(5);
        tree.get(1).add(9);
        // ... add remaining edges

        // Perform DFS starting from node 1 (root)
        dfs(1, tree);

        // Print DFS order
        for (int node : dfsOrder) {
            System.out.print(node + " ");
        }
    }
}