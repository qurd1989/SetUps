package easy;
import java.util.Scanner;
public class SoliderAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int totalCost = (w * (w + 1)) / 2 * k;
        int amountToBorrow = totalCost - n;
        System.out.println(amountToBorrow > 0 ? amountToBorrow : 0);
    }
}
        /*
          n dollars  he has
          k dollars first banana
          w bananas he wants
           n = 17;
            k = 3;
            w = 4;
            1 2 3 4
            1 * k + 2 * k + 3 * k
         */
