package IntroductionToProgramming;

import demo1.StaticMethods;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class PrintTestCases {

//
//    Print Test Cases
//    In the online judge system, a judge file may include multiple datasets to
//    check whether the submitted program outputs a correct answer for each test case.
//    This task is to practice solving a problem with multiple datasets.

    static final Scanner in = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out, false);


    public static void main(String[] args) {

            long start = System.currentTimeMillis();

            solve();
            out.flush();

            long end = System.currentTimeMillis();
            //trace(end-start + "ms");
            in.close();
            out.close();
        }

        static void trace(Object... o) { System.out.println(Arrays.deepToString(o));
    }





    static void solve() {
        for (int i = 1, x = 0; (x = in.nextInt()) != 0; i++) {
            out.println("Case " + i + ": " + x);
        }
    }
}
