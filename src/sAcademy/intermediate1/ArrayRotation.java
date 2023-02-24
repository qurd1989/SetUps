package intermediate1;

public class ArrayRotation {

    public static void main(String[] args) {

    }
    public int[] solve(int[] A, int B) {

        B %= A.length;
        reverseArray(A, 0, A.length-1);
        reverseArray(A, 0, B -1);
        reverseArray(A, B, A.length -1);


        return A;


    }

    public void reverseArray(int [] A, int startIndex, int endIndex) {


        while(endIndex > startIndex) {

            int temp = A[endIndex];
            A[endIndex] = A[startIndex];

            A[startIndex] = temp;

            startIndex++;
            endIndex--;

        }
}
}
