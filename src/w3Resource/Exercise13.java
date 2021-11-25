package w3Resource;

import java.util.Scanner;

public class Exercise13 {



    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);

        System.out.println("Get area and perimeter of rectangle");

        double width;
        double height;


        System.out.println("enter width number: ");
        width = sc.nextDouble();

        System.out.println("enter height number: ");
        height = sc.nextDouble();



        System.out.println("Area of rectange is: " + 2*(width+height));
        System.out.print("Preimeter of rectangle is: " + width*height);
    }
}
