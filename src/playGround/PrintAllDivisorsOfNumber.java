package playGround;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisorsOfNumber {
    public static void main(String[] args) {

    }

    public static List<Integer> printDivisors(int n) {
        List<Integer> list = new ArrayList<>();
        int num = (int) Math.sqrt(n);
        for (int i = 1; i < num; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
