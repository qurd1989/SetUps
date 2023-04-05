package intermediat2;

public class Isalnum {

    public static void main(String[] args) {



    }
    public static int solve(char[] A) {


        int n = A.length;

        if(n == 0) {
            return 0;
        }


        for (int i = 0; i < n; i++) {
            if (!(A[i] >= '0' && A[i] <= '9') && !(A[i] >= 'A' && A[i] <= 'Z') && !(A[i] >= 'a' && A[i] <= 'z')) {
                return 0;
            }
        }
        return 1;
    }
}

