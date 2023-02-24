package intermediate1;

public class ReverseInRange {

    public static void main(String[] args) {


        int []A = {1,3 ,4, 5, 6, 7, 8, 9, 10};
        int B = 3;
        int C =7;

        System.out.println(solve(A, B, C));
    }

    public static  int[] solve(int[] A, int B, int C) {


        while (B < C) {

            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B +=1;
            C -=1;

        }

        return A;


    }

}
