package array;

import java.io.FilterOutputStream;

public class SecondLargestelementInArray {

        public static void main(String[] args) {

                int arr [] = {2,5,6,3,6,7,8,9,};

                System.out.println(solve(arr));

        }
        public static int solve(int arr[]){

                int n = arr.length;
                 int firstLargest = Integer.MIN_VALUE;
                 int secondLargest = Integer.MIN_VALUE;

                 for (int i = 0; i< n; i++) {
                         if (arr[i] > firstLargest) {

                             secondLargest = firstLargest;
                             firstLargest = arr[i];

                         }
                         if (arr[i] <  firstLargest && arr[i] > secondLargest)  {

                                 arr[i] = secondLargest;
                         }

                 }
                return secondLargest;
        }
}
