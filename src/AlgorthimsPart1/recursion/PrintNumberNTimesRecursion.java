package recursion;

import java.util.Arrays;

public class PrintNumberNTimesRecursion {
    public static void main(String[] args) {

        int n = 5;
        int[] result = printNos(n);
        System.out.println(Arrays.toString(result));
    }
        public static int[] printNos(int x) {
            int i=0;
            int[] arr=new int[x];
            return call(arr,x,i);
        }
    public static int[] call(int[] a,int n,int i) {
        if(n>0) {
            a[i]=n;
            call(a,n-1,i+1);
        }
        return a;
    }

}