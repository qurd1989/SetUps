package arrays;

import java.io.PrintStream;

public class EgExample {

    public static void main(String[] args) {

        double[] name = {2,3,5,7,11};
        double sum = 0;

        for (int i = 0; i < name.length; i++) {

            System.out.printf("%d %s%n", i + 1, name[i]);

             sum = sum + name[i];
             int ave = (int)sum / name.length;
            System.out.println(ave);


        }
    }
}
