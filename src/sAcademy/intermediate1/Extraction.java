package intermediate1;

public class Extraction {

    public static void main(String[] args) {

        int a = 7789;

        System.out.println(solve(a));
    }
    public  static  int solve(int a)  {

        int cpunt =0;

        while(a != 0) {


          cpunt ++;
            a = a/10;


        }
     return cpunt;
    }
}
