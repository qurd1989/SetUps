package Collections.StarPatterns;

public class TrianglePattern1 {

    public static void main(String[] args) {



        int num = 5;

        printTriangle(num);

    }

    public  static void printTriangle(int n){


        for (int i = 0; i <= n; i++) {



            for (int j =0; j<=i; j++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
