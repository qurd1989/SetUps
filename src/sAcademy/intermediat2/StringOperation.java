package intermediat2;

public class StringOperation {

    public static void main(String[] args) {

        String A = "UgUGddUUGdgPSFO";
        System.out.println(solve(A));
        System.out.println(solve1(A));

    }


    public static String solve(String A) {

        int n = A.length();
        A = A + A;

        A = A.replaceAll("[A-Z]", "");


        A = A.replaceAll("[aeiouAEIOU]", "#");


        return A;

    }


    public static String solve1(String A) {

        A = A + A;
        int n = A.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            char c = A.charAt(i);

            if (Character.isUpperCase(c)) {

                continue;
            } else if (c == 'a' | c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' | c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                sb.append("#");
            } else
                sb.append(c);
        }

        return sb.toString();
    }
}


