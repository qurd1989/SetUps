package arrays;

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 9, 10};

        sum(arr);


    }

    public  static void sum(int[] arr) {


        int sum = 0;


        for (int i = 0; i< arr.length; i++) {


            sum+=arr[i];



        }

        System.out.println("Sum of the numbers in array are: " + sum);
    }
}
