import java.util.Scanner;

public class SwappingTwoNumbers{

    static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {


        int temp,x,y;

        while (true) {

            x = sc.nextInt();
            y = sc.nextInt();

            if (x == 0 && y == 0) {
                break;

            } else {

                if (x > y) ;
                temp = x;
                x = y;
                y = temp;

                System.out.println(x + " " + y);


            }

        }
    }
}


