package intermediate1;

import math.RandomNumbers;

import java.util.Scanner;

public class AAnyBasseToDecimal {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
         int myRandInt = RandomNumbers.generateRandomNumberInRange(1000,100);

         myRandInt = sc.nextInt();

         int B = 2;

        System.out.println(solve(myRandInt, B));
    }

    public  static  int solve(int A, int B) {


        int result = 0;
        int power = 1;

        while (A != 0) {
            int digit = A % 10;
            result += digit * power;
            power *= B;
            A /= 10;
        }

        return result;
    }

}


