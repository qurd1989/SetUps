package intermediat2;

public class ToggleCase {

    public static void main(String[] args) {

        String A = "FbxdWdoKwrezJPP";
        System.out.println(solve(A));
    }


    public static String solve(String A) {
       int n = A.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c =  A.charAt(i);

            if (Character.isUpperCase(c)) {

                sb.append(Character.toLowerCase(c));

            }
             else if(Character.isLowerCase(c)) {

                sb.append(Character.toUpperCase(c));
            }
             else
                 sb.append(c);
    }


        return sb.toString();
}

}
