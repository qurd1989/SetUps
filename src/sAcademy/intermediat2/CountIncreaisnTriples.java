package intermediat2;

public class CountIncreaisnTriples {

    public static void main(String[] args) {


        int [] A = { 17, 23, 30, 19, 8, 17, 17};

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
    int n = A.length;
    int ans = 0;

    for (int j = 1; j < n; j++) {

        int l = 0; int r = 0;
        for (int i = 0; i < j;  i++) {
            if (A[i] < A[j]) {

                l++;
            }
        }
            for (int k = j+ 1 ; k < n; k++) {
                if (A[j] < A[k]) {

                    r++;
                }


        }
        ans += (l*r);
    }
    return ans;
}
}


