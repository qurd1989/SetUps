package intermediat2;

public class ImplementPowerFunction {

    public static void main(String[] args) {

    }

    public int pow(int A, int B, int C) {

        if(A == 0) {
            return 0;

        }
        if(B == 0) {
            return 1;
        }
        long ans = pow(A, B/2, C)%C;

        ans = (ans * ans)%C;

        if (B % 2 ==1) {
            ans = (ans * A) %C;
        }

        return (int)ans;
    }

}
