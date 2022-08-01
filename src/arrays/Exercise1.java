package arrays;

public class Exercise1 {


    public static void main(String[] args) {


        long sumOfAllNumbers = sumOfAllNumbers(5);


        System.out.println(sumOfAllNumbers);


    }

    public static long sumOfAllNumbers(long number) {

        if (number == 0) {

            return 1;

        } else
            return number + sumOfAllNumbers(number - 1);
    }
}
