package IntroductionToProgramming;

public class DecimalToBinary {

    public static void main(String[] args) {


        int c = 16;

        System.out.println(powerOftwo(c));

    }


    public static boolean powerOftwo(int n ) {

        boolean ans;

        if (n == 0){

            throw new RuntimeException("Zero is an Exception:");

        }else{
             ans= (n & (n-1)) == 0;
        }
        return ans;

    }
}
