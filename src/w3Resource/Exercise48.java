package w3Resource;

public class Exercise48 {


    // Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

    private static void dividedNumber3(int n) {

        if (n % 3 == 0) {


            System.out.println("Divided by 3: " + n);
        }

    }

    private static void dividedNumber5(int n) {

        if (n % 5 == 0) {

            System.out.println("Divided by 5: " + n);
        }


    }

    private static void dividedNumber3And5(int n) {

        if ((n % 3 == 0 && n % 5 == 0)) {

            System.out.println("Divided by 3 and  5: " + n);
        }


    }





    public static void main(String[] args) {



        for (int i = 0; i<100; i++) {

            dividedNumber3(i);

        }


        for (int i = 0; i<100; i++) {

            dividedNumber5(i);

        }
        for (int i = 0; i<100; i++) {

            dividedNumber3And5(i);

        }

    }
}
