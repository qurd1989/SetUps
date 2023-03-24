package intermediate1;

public class DivisibiltyByEight {

    public static void main(String[] args) {


         String A = "168";

        System.out.println(solve(A));

    }

    public static int solve(String A) {

         int n = A.length();
       if(n ==1) {
           if (A.contains("0") && A.contains("8")) {
               return 1;

           } else {
               return 0;
           }
       } else if (n == 2) {
          if (Integer.parseInt(A) % 8 ==0) {
              return 1;
           }else {
              return 0;

          }

    }else {
           int lastThreeDigit = Integer.parseInt(A.substring(n-3));
           if (lastThreeDigit % 8 == 0) {
               return 1;

           }else
               return 0;

       }
}

}
