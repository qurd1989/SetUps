package playGround;

public class Solution {
    public static void main(String[] args) {
        int t = 123;

        System.out.println(solve(t));
    }
    public static int solve(int num) {
        if (num == 1) {
            return num;
        } else if (num <= 0) {
            return -1;
        } else {
            return solve(num / 3);
        }

    }
}
