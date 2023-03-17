package intermediate1;

public class FindPairSum {

    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 65, 6, 7, 7, 8, 9, 9, 9, 0};

        int b = 11;
        System.out.println(solve(a, b));
        System.out.println(solve1(a, b));

    }

    public static int solve(int[] a, int b) {


        int n = a.length;

        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (a[i] + a[j] == b) {

                    count++;
                }

            }
        }
        return count;
    }

    public static int solve1(int[] a, int b) {

        int n = a.length;

        int high = n;
        int low = 0;

        int count = 0;
        int i = 0;
        int j = 1;


        while (high > i) {

            if (a[i] + a[j] == b) {

                count++;
                i++;
                j++;
            } else if (a[i] + a[j] < b) {
                j++;
            } else {
                high--;
            }

        }
        return count;
    }
}