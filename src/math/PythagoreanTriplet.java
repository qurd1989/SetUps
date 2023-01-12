package math;

import java.util.Arrays;

public class PythagoreanTriplet {

    public static void main(String[] args) {


        int[] truple = {1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(pythagoreanTriple(truple));

    }


    public static int pythagoreanTriple(int[] triple) {

        Arrays.sort(triple);

        int[] count = new int[triple.length];

        Arrays.fill(count,1);

        for (int i = 0; i < 3; i++) {

            for (int j = i+1; j < 3; j++) {

                for (int k = j+1; k < 3; k++) {

                    int a = triple[i];
                    int b = triple[j];
                    int c = triple[k];

                    if (a*a + b*b == c*c) {
                        
                        count[k]++;
                        if(count[k]>1)
                            return c;
                    }
                }
            }
        }
        return -1;
    }
}
