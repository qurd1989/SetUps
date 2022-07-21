package w3Resource;

import java.util.Scanner;

public class Exercise78 {

    /*
     * Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of Array: ");
        int arrayLenght = sc.nextInt();
        int[] givenArray = new int[arrayLenght];


        System.out.println("Enter  Array: ");
        for (int i = 0; i < arrayLenght; i++) {


            givenArray[i] = sc.nextInt();
        }


        System.out.println("Result is: " + findTwoIntegerInArray(givenArray));

    }

    public static boolean findTwoIntegerInArray(int[] givenArray) {



        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] == 4 && givenArray[i] == 7) {
                return true;


            } else if (givenArray[i] == 4 || givenArray[i] == 7) {

                return false;
            }

        }


        return true;
    }
}
