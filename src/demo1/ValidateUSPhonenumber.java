package demo1;

import java.util.Scanner;

public class ValidateUSPhonenumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        System.out.println("Enter you phone number");

        int phoneNumber = sc.nextInt();

        for (int i = 1; i <= phoneNumber; i++) {
            System.out.print("+1");

            if (String.valueOf(phoneNumber).length() == 9) {
                System.out.print(  phoneNumber + ": Thanks you.");


            }else{
                System.out.println("Wrong number");



        }
            System.out.println();
            break;
        }



    }
}
