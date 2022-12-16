package arrays;

public class HormanicClass {

    public static  int getCoupon(int n ) {

        return (int)(Math.random() * n);
    }


    public static int collectionCoupens(int n) {

        boolean[] isCollected  = new boolean[n];

        int count = 0, distinct = 0;

        while (distinct < n) {

            int r = getCoupon(n);
            count++;
            if (!isCollected[r])
                distinct++;

            isCollected[r] = true;



        }
        return count;



    }
    public static void main(String[] args) {


        int n = Integer.parseInt(args[0]);
        int count  = collectionCoupens(n);

        System.out.println(count);




    }
}
