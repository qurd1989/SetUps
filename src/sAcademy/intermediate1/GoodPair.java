package intermediate1;

import java.util.ArrayList;

public class GoodPair {

    public static void main(String[] args) {


        ArrayList<Integer> A1 = new ArrayList<>();
        A1.add(1);
        A1.add(2);
        A1.add(3);
        A1.add(4);


        int [] A = {1,2,3,4};
        int B=7;
        System.out.println(solve(A,B));
        System.out.println(solve1(A1,B));
    }
    public static int solve(int[] A, int B) {


        for (int i = 0;  i < A.length; i++) {
            for (int j = i+1; j <   A.length; j++) {

                if (A[i] + A[j] == B) {

                    return 1;
                }
            }
        }
        return 0;
    }

    public static int solve1(ArrayList<Integer> A, int B) {


        for (int i = 0;  i < A.size(); i++) {
            for (int j = i+1; j <   A.size(); j++) {

                if (A.get(i)+ A.get(j) == B) {

                    return 1;
                }
            }
        }
        return 0;
    }
}
