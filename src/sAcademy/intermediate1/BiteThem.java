package intermediate1;

public class BiteThem {
    public static void main(String[] args) {


  int b = 10;
  int a = 11;
        System.out.println(solve(a,b));
    }
    public static int solve(int a, int b) {


        if ((a & b) !=0) {

            return 1;
        }

        return 0;

    }
}
