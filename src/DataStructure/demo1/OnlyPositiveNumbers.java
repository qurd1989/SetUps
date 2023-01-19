package demo1;

import java.util.Scanner;

public class OnlyPositiveNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        while(true) {


            System.out.println("Enter number: ");
            number = sc.nextInt();


            if(number <0) {
                System.out.println("Unsuitable number: ");

                continue;
            }
            if(number ==0) {

                break;


            }
            if (number>0){

                number =number*number;

                System.out.println(number);
            }
        }


    }
}
