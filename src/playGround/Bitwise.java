package playGround;

public class Bitwise {
    public static void main(String[] args) {

        int n = 15;
        int m = 12;
        System.out.println(solve(n,m));
    }

    public static int solve(int n, int m){

        int c = ((n & m) &(n|m));
        return c;
    }
}
