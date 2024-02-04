package mathWorks;

public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num));
    }
    static int addDigits(int num){
        int sum  = 0;
        int extract = 0;
        while (num != 0){
            if (num > 9) {
                extract = num % 10;
                sum = sum +extract;
                num /= 10;
            }
        }
        int result = sum +num;
        return result;
    }

}

