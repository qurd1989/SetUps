package w3Resource;

import java.util.Scanner;

public class Exercise76 {

    /*
     * Write a Java program to test if the first or the last element of two array of integers are same.
     *  The length of the array must be greater than or equal to 2
     *
     * */

    private static boolean firstAndLastTwoArray(int[] firstArray, int[] secondArray) {


        int firsIndexOFirstArray = firstArray[0];
        int lastIndexOfSecondArray = secondArray[secondArray.length - 1];


        if (firsIndexOFirstArray == lastIndexOfSecondArray) {

            return true;

        } else if (firsIndexOFirstArray != lastIndexOfSecondArray){

         return false;
        }


        return true;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  length of first Array: ");
        int firstArray = sc.nextInt();
        int[] givenArray = new int[firstArray];


        System.out.println("Enter length of second Array: ");
        int secondArray = sc.nextInt();
        int[] givenArray1 = new int[secondArray];


        System.out.println("Enter First array:");
        for (int i = 0; i < firstArray; i++) {


            givenArray[i] = sc.nextInt();
        }


        System.out.println("Enter Second array:");
        for (int k = 0; k < secondArray; k++) {


            givenArray1[k] = sc.nextInt();
        }


        System.out.println("Result is: " + firstAndLastTwoArray(givenArray, givenArray1));
    }
}
