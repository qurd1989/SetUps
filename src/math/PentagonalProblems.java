package math;

public class PentagonalProblems {

    public static int sumOfPentagonalNum(int n) {

        return n * (3*n - 1)/2;




    }
     public static void main(String[] args) {


         System.out.println("100 pentagonal numbers are: ");

         for (int i = 1; i < 101; i++ ){

             System.out.println("%7d " + sumOfPentagonalNum(i));
             if (i % 10 ==0) {
                 System.out.println();
             }
         }
    }
}
