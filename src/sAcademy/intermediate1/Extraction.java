package intermediate1;

public class Extraction {

    public static void main(String[] args) {

        int a = 7789;

        System.out.println(solve(a));
    }
    public  static  int solve(int a)  {

        int lastElement = 0 ;
        while(a > 0) {

            lastElement = a % 10;
            a = a/10;
            lastElement =a;
            break;
        }
        return lastElement;
    }
}
