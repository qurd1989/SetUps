package w3Resource;

import java.util.Scanner;

public class Exercise67 {

    public static String insertCharacter(String str, char c, int i ){



        return str.substring(0,i) + c + str.substring(i);
        
    }

    public static void main(String[] args) {


        char c;
        int index;

        Scanner scanner = new Scanner(System.in);

        String givenString = " my name is Elmar";


        System.out.println("Enter the character: ");
        c = scanner.next().charAt(0);

        System.out.println("Enter the index position: ");
        index =scanner.nextInt();

        String newString = insertCharacter(givenString,c,index);


        System.out.println("original String : " + givenString);
        System.out.println("New String: " + newString);
    }
}
