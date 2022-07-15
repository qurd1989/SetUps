package w3Resource;

import java.util.Scanner;

public class Exerise68 {



    public static  String copyLastThreeCharacters( String str, int count) {

        String lastThreeCharacters = str.substring(str.length() - 3);


       String repeatedCharacters =  lastThreeCharacters.repeat(count);


        return   repeatedCharacters;



    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value: ");

        String x = sc.nextLine();


        int count = 3;

        System.out.println(copyLastThreeCharacters(x, count));
    }
}
