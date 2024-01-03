package intermediate1;

import static javax.swing.text.html.HTML.Attribute.N;

public class PrimeNumber {

    public static void main(String[] args) {

    }

    public  static  int solve(Long A) {
        if (A == 1)
            return 1;

        for (int i = 2; i <= A; i++) {
            if ((long) i * i == A) {
                return 1;
            }
        }

        return -1;
    }
}
