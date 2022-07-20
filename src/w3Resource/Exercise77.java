package w3Resource;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise77 {

    /*
    * Write a Java program to create a new array of length 2 from two arrays of integers with three elements and
    *  the new array will contain the first and last elements from the two arrays
    * */

    private static int[] combinationOFTwoArrays(int[] firstArray, int[] secondArray) {

        int firstElementOfFirstArray = firstArray[0];
        int  lastElementOfSecondArray = secondArray[secondArray.length -1];

        int[] thirdArray = new int[firstElementOfFirstArray + lastElementOfSecondArray];



        return thirdArray;





    }
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int  firstArrayLenght = sc.nextInt();
        int[] firstArray = new int[firstArrayLenght];

        System.out.println("Enter length of Array: ");
        int  secondArrayLenght = sc.nextInt();
        int[] secondArray = new int[secondArrayLenght];


        System.out.println("Enter first Array: ");
        for (int i = 0; i<firstArrayLenght; i++) {


            firstArray[i] = sc.nextInt();
        }



        System.out.println("Enter Second Array: ");
        for (int k = 0; k<secondArrayLenght; k++) {


            secondArray[k] = sc.nextInt();
        }




        System.out.println("Third Array will be : " +Arrays.toString( combinationOFTwoArrays(firstArray, secondArray)));

    }
}
