package math;

import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

import static java.util.stream.IntStream.rangeClosed;

public class PowesOfTwo {

    public static void main(String[] args) {


        long[] reult = powersOfTwo(5);



    }



    public static  long[] powersOfTwo(int n) {

        long[] result = new long[n+1];
        result[0] = 1;
        for (int i = 1; i <= n; i++) {
            result[i] = result[i-1] * 2;
        }
        return result;


    }


}
