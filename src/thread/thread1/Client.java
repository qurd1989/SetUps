package thread1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Adder adder = new Adder(a,b);
        ScalerThread scalerThread = new ScalerThread(adder);
        scalerThread.start();
    }
}
