package intermediat2;

import java.util.ArrayList;

public class MultipleLeftRotationsOfArray {
    public static void main(String[] args) {

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = A.size();

        for(int x : B) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++)
                temp.add(A.get((i + x) % n));
            ans.add(temp);
        }


        return ans;

    }
}
