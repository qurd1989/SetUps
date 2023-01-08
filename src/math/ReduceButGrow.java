package math;

public class ReduceButGrow {


    public static void main(String[] args) {



        int[] x = {1,2,3,4,5};

        System.out.println(grow(x));


    }

    public static int grow(int[] x){


        int result = 1;

        for (int i = 0; i < x.length; i++){


            result *= x[i];
            System.out.println(result);


        }
        return result;


    }
}
