package intermediat2;

public class LonmgestCommonPrefix {


    public static void main(String[] args) {

         String  A[] = {"Elmarrdish", "elmardududd", "Elmgsuusu"};

        System.out.println(solve(A));
    }

    private static String solve(String[] a) {

        int n = a.length;
        if (n == 0) {
            return "";
        }

        String prefix = a[0];

        for (int i = 0; i < n; i++) {

            while (a[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);

            }
        }

        return prefix;


}
}