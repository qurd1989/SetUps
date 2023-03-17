package intermediate1;

public class Compare {

    public static void main(String[] args) {


        int n = 123;

        System.out.println(solve(n));

    }

    public static String solve(int n) {

        while (n > 0) {

            if((n&1)!= 0) {

                return "ODD";
            }
    break;
        }
        return "Even";

    }
}
