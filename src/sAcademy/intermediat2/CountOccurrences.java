package intermediat2;

public class CountOccurrences {

    public static void main(String[] args) {


        int arr [] = { 100, 200,300, 400, 500};
        System.out.println(solve(arr));
    }

    public static int solve(int []arr) {

        int n = arr.length;

        int max = 0;

        for (int i = 0; i < n -1; i++) {
            for (int j = i +1; j < n; j++) {
                if (arr[i] + arr[j] > max) {

                    max = arr[i] + arr[j];

                }
            }
        }
        return max;
    }
}
