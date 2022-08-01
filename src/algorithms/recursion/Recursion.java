package recursion;

public class Recursion {

    public static void main(String[] args) {


        System.out.println("Resut is: " +  sumTwo(5));
    }

    public static int sumTwo(int m) {

        if(m > 0) {

            System.out.println("Result:" + m + " ");
            sumTwo(m - 1);



        }
        return m;
    }
}
