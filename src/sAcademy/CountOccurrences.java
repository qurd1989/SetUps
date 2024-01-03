public class CountOccurrences {

    public static void main(String[] args) {


        String A = "bob";
        System.out.println(solve(A));

    }

    public  static int solve(String A) {


        int n = A.length();

        int count = 0;

        for(int i = 0; i < n -2; i++) {

            if (A.startsWith("bob", i));
            count++;

        }

        return count;
    }
}
