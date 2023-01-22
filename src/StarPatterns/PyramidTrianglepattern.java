package StarPatterns;

public class PyramidTrianglepattern {


    public static void main(String[] args) {


        int rows = 9;

/*
        for (int i = 1;  i <= rows; i++){


            for (int j = rows; j>i; j--) {

                System.out.print("1");


            }

            for (int k = 1; k <= (i * 2) -1;  k++) {

                System.out.print("*");
            }

            System.out.println();




        }*/
        pyramidTriangle(rows);


    }

    public static void pyramidTriangle(int n) {


        for (int i = 0; i < n; i++) {


            for (int j = 0; j < n - i -1; j++){


                System.out.print("1");

            }
            for (int k = 0; k < (i * 2) + 1; k++) {

                System.out.print("*");
            }


            for (int m = 0;  m < n-i -1; m++){

                System.out.print("1");
            }

            System.out.println();
        }



    }

}
