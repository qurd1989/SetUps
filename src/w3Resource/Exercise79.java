package w3Resource;

public class Exercise79 {


    //Write a Java program to rotate an array (length 3) of integers in left direction

    public static void rotateByK(int[] arr, int k) {

        int len = arr.length;

        k = k % len;

        reverse(0, len-k-1, arr);
        reverse(len-k, len-1, arr);
        reverse(0, len-1, arr);



    }

    public static void reverse(int start, int end, int[] arr) {

        while (start < end) {

            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end++;

        }
    }


    public static void main(String[] args) {


        int[] arr = {1,2,4};
        int k = 5;




        rotateByK(arr, k);



        for (int i = 0; i < arr.length; i++) {


            System.out.println(arr[i] + " ");

        }
    }
}
