package w3Resource;

import java.util.Scanner;

public class Exercises75 {


    /*
    Write a Java program to test if the first and the last element of an array of integers are same.
     The length of the array must be greater than or equal to 2
    *
    * */

    private  static  boolean  verifyFirstAndLastElementOfArray(int[] elements) {



            int firstElementOfArray = elements[0];

            int lastElementOFArray = elements[elements.length - 1];

            if ( elements.length >=2 && firstElementOfArray == lastElementOFArray) {

                return true;

            }else if (elements.length >=2 || firstElementOfArray == lastElementOFArray){

                return false;


            }



        return true;

    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of  Array: ");

        int length = sc.nextInt();

        int[] givenArray = new int[length];


        System.out.println("Enter an Array: ");
        for (int i = 0;  i<length; i++) {

            givenArray[i] = sc.nextInt();


        }

        System.out.println("Result is : " + verifyFirstAndLastElementOfArray(givenArray));

    }
}
