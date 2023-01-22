package StarPatterns;

public class ReverseTrianglePatten {


    //print stars  in reverse Triangle


    public static void main(String[] args) {


        int n = 6;

        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= n - i +1; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
