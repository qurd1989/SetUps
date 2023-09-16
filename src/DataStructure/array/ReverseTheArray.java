package array;

import java.util.Arrays;

public class ReverseTheArray {

    public static void main(String[] args) {


        int arr[] = {1,3,4,54,56,7};

        reverse2(arr);
//        reverse1(arr);
//      reverse(arr);
        for (int i = arr.length -1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void reverse(int [] n ) {

        int start = 0;
        int end = n.length- 1;
        int temp;
        while (start < end) {

            temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
    }
    public  static int[] reverse1(int n[]) {

        int revverse[] = new int[n.length];
        int temp = 0;
        for (int i = n.length-1; i >= 0; i--) {
            revverse[n.length -i -1] = n[i];
        }
        return revverse;
    }
    public static String[] reverse2(int n[]){

        int num =n.length;
        StringBuilder sb = new StringBuilder();

        for (int i = num -1; i >= 0; i--) {
            sb.append(n[i]);
        }
        String temp[] = sb.toString().split(" ");
        return temp;
    }
}
