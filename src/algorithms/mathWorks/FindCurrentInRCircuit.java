package mathWorks;

import java.util.Scanner;

public class FindCurrentInRCircuit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int r =sc.nextInt();

        int y = v/r;
        System.out.println(y);
    }
}
