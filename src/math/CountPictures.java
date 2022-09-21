package math;

public class CountPictures {

    static int countDownPicsOnTheWall(int x) {

        if(x ==0 ){
            System.out.println("No More Pics left on the Wall");

        }else {
            System.out.println("ya’ take one down, ya’ pass it around: " + x + " pics left");

            countDownPicsOnTheWall(x - 1);
        }
        return x;
    }



    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n % 2 != 1) ? oddSum(n - 1) : oddSum(n - 1) + n;
        }
    }


    public static void main(String[] args) {



        int x = 100;

        System.out.println(countDownPicsOnTheWall(x));
        System.out.println(oddSum(x));

    }
}
