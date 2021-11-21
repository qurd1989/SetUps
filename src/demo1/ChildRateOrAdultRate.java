package demo1;

import java.sql.Savepoint;
import java.util.Scanner;

public class ChildRateOrAdultRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.println("Enter yout age: ");

        age = sc.nextInt();

        if (age < 13) {
            System.out.println("Child Rate: ");

        } else {
            System.out.println("Adult rate: ");

        }
        System.out.println("Enjoy your movies;");
    }
}