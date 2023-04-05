package intermediat2;

public class ReverseTheString {

    public static void main(String[] args) {

    }

    public static String solve(String A) {

       int n = A.length();
       int i = 0;
       String result = "";

       while (n > i) {
           while (i < n && A.charAt(i) == ' ')
               i++;
           if(n <= i)
               break;
           int j = i +1;
           while (j < n && A.charAt(j) != ' ')
               j++;
           String sub = A.substring(i, j-i);
           if (result.length() ==0)
               result = sub;
           else
               result = sub + " " + result;
           i = j +1;


       }
       return result;
    }

}
