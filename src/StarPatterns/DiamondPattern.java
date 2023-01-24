package StarPatterns;

public class DiamondPattern {



    public static void main(String[] args) {


        int n = 6;

        reversePyramid(n);
        pyramidPattern(n);

    }

        public static void reversePyramid(int n){


            for (int i = 0; i <= n; i++) {

                for (int k = n; k >= i; k--) {

                    System.out.print(" ");
                }
                for (int j = 0; j <=(2 * i) -1; j++) {

                    System.out.print("*");

                }
                for (int j = 0; j < i; j++) {

                    System.out.print(" ");
                }


                System.out.println();
            }
        }

        public static void pyramidPattern(int n) {


        for(int i = n; i >= 1; i--){

            for(int j = n; j >= i; j--) {

                System.out.print(" ");

            }
            for (int j = 0;  j <= (i * 2) -1; j++){

                System.out.print("*");
            }

            System.out.println();
        }
        }

    }

