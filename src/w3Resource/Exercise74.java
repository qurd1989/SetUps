package w3Resource;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise74 {


    private static boolean  firstandLastElementOfArray(int[] single) {

        int firstIndexInArry = single[0];

        int lastIndexinArry = single[single.length-1];


        if (firstIndexInArry == lastIndexinArry) {

            return true;
        }else if (firstIndexInArry != lastIndexinArry) {


            return false;
        }else
            System.out.println("Cant find  any index in Array!");



        return true;


    }

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Lenght of Array: ");
        int length = sc.nextInt();

        //creating new Array
        int[] givenArray = new int[length];



        for (int i=0; i<length; i++) {

            System.out.println("Enter the elements of the array:");
            givenArray[i] = sc.nextInt();


        }



        System.out.println("Print given array: " + firstandLastElementOfArray(givenArray));

    }
}
