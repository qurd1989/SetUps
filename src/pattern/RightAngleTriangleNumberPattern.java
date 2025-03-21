package pattern;

import java.util.Scanner;

public class RightAngleTriangleNumberPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int raws = sc.nextInt();

        for (int i = 1; i <= raws; i++){

            for (int j = 1; j <= i; j++){
                System.out.print(j + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }

}
