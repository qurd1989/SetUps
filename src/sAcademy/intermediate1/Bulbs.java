package intermediate1;

public class Bulbs {

    public static void main(String[] args) {

        int[] A ={1,0,1,0,0,1};

        System.out.println(bulb(A));
    }
    public static int bulb(int[] A) {

        int count = 0;

        for (int i= 0; i < A.length; i++){

            if (A[i] == 1) {
                i++;
                for (int j = i;  j < A.length; j++) {
                    A[j] = 1-A[j];
                    count++;

                }
            }
        }
        return count;
    }
}
