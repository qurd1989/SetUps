package intermediate1;

public class ElemntsBetweenTwoNumbers {

    public static void main(String[] args) {

        //a must be greater than b all the time

        int aa = 2234;
        int bb =  2122;


        System.out.println(solve(aa,bb));

    }

    public static int solve(int a, int b ){

        Long startTime = System.currentTimeMillis();

        int elementBetweenTwoNumbers = a - b + 1;

        long endTime = System.currentTimeMillis();
        long speed = endTime -startTime;

        System.out.println(speed);
        return elementBetweenTwoNumbers;
    }

    public void fuinction(int n){

        while (n > 0) {
            n++;
            n -=2;

        }

    }
}
