package IntroductionToProgramming;

import java.util.Scanner;

public class StoringThreeNumber {

    //Write a program which reads three integers, and prints them in ascending order.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers  of Element you want enter: ");
        int n = sc.nextInt();

        int[] arraySize = new int[n];

        System.out.println("Enter number all array elements: ");
        for (int i = 0; i < n; i++) {

            arraySize[i] = sc.nextInt();


        }

        sortingNumber(arraySize);


    }

    public static void sortingNumber(int[] n) {

        int temp;

        for (int i = 0; i < n.length; i++) {

            for (int j = i + 1; j < n.length; j++) {


                if (n[i] > n[j]) {


                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;


                }
            }


            System.out.println("Print Number in ascending order: ");

//        for (int i = 0; i < num; i++) {
//
//            System.out.print(n[i] + " ");
//        }

            System.out.println(n[0] + " " + n[1] + " " + n[2]);
        }
    }
}
