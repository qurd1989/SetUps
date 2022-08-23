package w3Resource;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exercise80 {




    static int largest(int arr[]) {


        int max = arr[0];

        for (int i = 1;  i < arr.length; i ++) {

            if (max < arr[i]) {

                max = arr[i];

            }

        }
        return max;

    }

    public static void main(String[] args) {


        int arr[] = {1, 3, 4, 5, 6,8, 17};

        System.out.println("Largest number is : " + largest(arr));

    }
}
