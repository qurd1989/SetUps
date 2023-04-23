package intermediat2;

public class K_ThSymbol {

    public static void main(String[] args) {

    }

    public int solve(int A, int B) {
        if (A == 1) {
            return 0; // The first row always has a single 0
        }
        int parent = solve(A - 1, B / 2); // Find parent row and index
        if (parent == 0) {
            return (B % 2 == 0) ? 0 : 1; // If parent is 0, Bth symbol is 0 if B is even, else 1
        } else {
            return (B % 2 == 0) ? 1 : 0; // If parent is 1, Bth symbol is 1 if B is even, else 0
        }
    }
}
