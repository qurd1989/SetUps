package math;

public class PrimeNumbers {

    public static void main(String[] args) {


        int n = 36;

        int sum = 0;


        for (int i = 1; i * i < n; i++) {

            if (n % i == 0) {

                sum += i;

                if ((n % i) != i) {
                    sum += (n / i);

                }
                System.out.println(sum);
            }

        }
        System.out.println(sum);

    }
}
