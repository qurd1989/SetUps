package arrays;

public class PassingArrayToMethod {


    public static void sum(int[] arr) {

        int sum = 0;

        for (int i =0; i < arr.length; i++) {

            sum += arr[i];



        }

        System.out.println("sum of the element in the Array is: " + sum);

    }


    public static void main(String[] args) {



        int[] arr = {2, 3, 56,78,89,4};

          sum(arr);


    }
}
