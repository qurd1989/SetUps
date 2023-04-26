package tree;

import java.util.Scanner;

public class DynamicConnectivityClienrt {

    DynamicConnectivityClienrt(int n){

    }

    void union(int p, int q){

    }
    boolean  connected(int p, int q) {

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        DynamicConnectivityClienrt dcc = new DynamicConnectivityClienrt(n);


        int p = sc.nextInt();
        int q = sc.nextInt();

        if (dcc.connected(p,q)){
            dcc.union(p,q);
            System.out.println(p + " "  + q);
        }


    }

}
