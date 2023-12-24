package playGround;

public class Calculator {
    public static void main(String[] args) {


        // Parse command-line arguments
        double P = 4.23;
        double r = 45.32;
        double t = 2;

        // Calculate continuously compounded interest
        double amount = calculateAmount(P, r, t);

        // Print the result
        System.out.println("Amount after " + t + " years: " + amount);
    }

    private static double calculateAmount(double P, double r, double t) {
        return P * Math.exp(r * t);
    }
}