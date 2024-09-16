package easy;

public class Word {
    public static void main(String[] args) {
         java.util.Scanner sc = new java.util.Scanner(System.in);
         String s = sc.next();
         int lowerCase = 0;
         int upperCase = 0;
         for (int i =0; i < s.length(); i++) {
             if (Character.isLowerCase(s.charAt(i))) {
                 lowerCase++;
             } else {
                 upperCase++;
             }
         }
            if (lowerCase >= upperCase) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(s.toUpperCase());
            }
    }
}
