package intermediate1;

public class SecondLargestNumber {

    public static void main(String[] args) {



    }
    public int solve(int[] A) {

        int largest = 0;  int secondLarget = -1;

        for (int i = 0; i < A.length; i++) {

            if (A[i] > largest) {

                largest = A[i];


            }
        }



        for (int i = 0; i < A.length; i++) {
            if (A[i] != largest) {

                if (A[i] > secondLarget) {


                    secondLarget = A[1];
                }


            }


        }



        return secondLarget;

    }

}