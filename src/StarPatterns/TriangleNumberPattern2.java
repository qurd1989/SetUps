package StarPatterns;

public class TriangleNumberPattern2 {


    public static void main(String[] args) {


        //printing same numbers for given rows

        int n = 6;


        for (int i = 0; i <=n; i++ ){

            for (int j = 0; j <= i; j++) {

                System.out.print(i);

            }
            System.out.println();
        }
    }
}