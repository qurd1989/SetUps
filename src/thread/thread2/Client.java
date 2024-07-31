package thread2;

import java.util.Scanner;

public class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            TableCreator tc = new TableCreator(i);
        }
    }
}
