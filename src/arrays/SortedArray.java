package arrays;

public class SortedArray {

    static void dec(int n) {

        //base
        if (n == 0) {
            return;

        }
        System.out.println(n);
        dec(n - 1);
        System.out.println(n);


    }

//    static void inc(int n) {
//
//        if (n == 0) {                 //1
//            return;
//        }
//        System.out.println(n);        //2
//
//        inc(n - 1);                   //3
//        System.out.println(n);
//
//    }


    public static void main(String[] args) {


        int m = 7;

        dec(m);

    }
}
