package playGround;

public class GCD {
    public static void main(String[] args) {

        int a = 50;
        int b = 76;
        System.out.println(solve(a, b));
        System.out.println(solve1(a, b));
    }

    public static int solve(int a, int b) {

        if (b == 0) {
            return a;
        }
        return solve(b, a % b);
    }


    public static int solve1(int a, int b) {
        while (b != 0){
            int temp =b;
            b = a % b;
            a = temp;
        }
        return a;
    }

//    public static int solve2(int b, int a){
//
//        while (b==0
//        }



}
