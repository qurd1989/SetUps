package arrays;

public class BinarytoDecimal {

    public static void main(String[] args) {


        String binary  = "100";
        System.out.println(solve(binary));
    }

    private static int solve(String bianry) {

        int decimal = 0;

        String reversedBinary =  new StringBuilder(bianry).reverse().toString();

        for(int i =0; i<reversedBinary.length(); i++) {

            int digit = reversedBinary.charAt(i) - '0';
            decimal += digit * Math.pow(2, i);



        }
        return decimal;
    }
}
