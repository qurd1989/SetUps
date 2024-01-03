package math;

public class BinarySearch {

    public  double db;
    public  double db1;


    public BinarySearch(double denk, double denck1) {

        this.db = denk;
        this.db1 = denck1;

    }



    public static void main(String[] args) {


        BinarySearch rent = new BinarySearch(12.4, 23.4);


        System.out.println(rent);

        int  n = 10;
        System.out.println(Integer.toBinaryString(n));

    }
}
