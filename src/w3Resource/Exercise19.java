package w3Resource;

import java.util.Scanner;

public class Exercise19 {





            public static int decimalNumberCovertion(int a) {


                String decimNumber = Integer.toBinaryString(a);

                return Integer.parseInt(decimNumber);


            }

            public static void main(String[] args) {


                //convert decimal to Binary

                Scanner sc = new Scanner(System.in);


                int num = sc.nextInt();


                System.out.println(decimalNumberCovertion(num));

            }
        }


