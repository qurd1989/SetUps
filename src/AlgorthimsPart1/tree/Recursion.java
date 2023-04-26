package tree;

public class Recursion {

    public static void main(String[] args) {

//
//        long x = factorial(3);
//        System.out.println(x);

        long y = fibonacci(5);
        System.out.println(y);
    }


    public  static long factorial (int n) {


        if (n == 0) {

            return 1;


        }else  {
            return factorial( -1) * n;

        }

    }

    public static long fibonacci(int n) {

        if(n == 0 || n == 1) {
            return 1;

        }else{

            return fibonacci(n-1)+ fibonacci(n - 2);

        }
    }
}
