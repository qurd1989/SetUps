package intermediate1;

public class MakeIT {

    public static void main(String[] args) {

        int mango = 19;
        int sliceOfMangoes = 0;

        System.out.println(solve(mango, sliceOfMangoes));
    }

    public static  int solve(int A, int B)   {

        int glassesOfMangoShakes = (3 * A + B) /2;

        return glassesOfMangoShakes;

    }
}
