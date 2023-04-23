package intermediat2;

public class K_ThSymbol {

    public static void main(String[] args) {

    }

    public  static int solve(int n, int k) {


        if (n ==1 ) {
            return 0;

        }
        int parent = solve(n-1, k/2 + k%2);

        boolean isKthOdd = ((k & 2) ==1);

        if (parent == 1) {
            return
        }
    }
}
