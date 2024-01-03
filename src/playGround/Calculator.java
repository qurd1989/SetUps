package playGround;

public class Calculator {
    public static void main(String[] args) {


        // Parse command-line arguments
        double P = 4.23;
        double r = 45.32;
        double t = 2;
        int s = 123454;
        System.out.println(calculateAmount(s));


    }

    private static int calculateAmount(int n ) {

        int res = 0;
        int x = 0;
        while (n!=  0){
            res = res * 10 + n %10;
            n /= 10;
        }
        return res;
    }
}