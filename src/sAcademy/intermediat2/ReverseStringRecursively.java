package intermediat2;

import java.util.Scanner;

public class ReverseStringRecursively {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        solve(str);
    }

    public  static void solve( String a){
        int n = a.length();

        if (a==null || n <=1) {
            System.out.print(a);
            return;

        }
        solve(a.substring(1));
        System.out.println(a.charAt(0));
    }
}
