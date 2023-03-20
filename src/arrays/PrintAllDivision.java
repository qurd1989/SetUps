package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllDivision {

    public static void main(String[] args) {

        int  n = 49;


        System.out.println((solve(n)));
    }

    public  static List solve(int a) {


       List<Integer> ls = new ArrayList<>();
        for (int  i = 1; i * 1 < a; i++) {

            if (a % i==0) {
                ls.add(i);
                if (a/i != i) {
                    ls.add(a/i);
                }


            }
        }
        return ls;
    }
}
