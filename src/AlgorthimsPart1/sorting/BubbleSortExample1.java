package sorting;

import java.util.HashSet;
import java.util.Set;

public class BubbleSortExample1 {
    public static void main(String[] args) {

    }
    public static boolean solve(int num[]) {
        Set<Integer> set =new HashSet<>();
        set.add(0);

        int sum = 0;
        for (int a : num){
            sum += num[a];
            if (set.contains(sum)){
                return  true;
            }
            set.add(sum);

        }

        return false;
    }

}
