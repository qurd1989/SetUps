package demo1;

import java.util.Scanner;

public class WhileLoopIteration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {


            System.out.println("Exit? (Y is there)");

            String str = sc.nextLine();


            if(str.equals("Y")){
                break;
            }

            System.out.println("Move one next line");
        }

        System.out.println("Ready!");


    }
}
