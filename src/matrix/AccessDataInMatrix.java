package matrix;

public class AccessDataInMatrix {

    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {11, 12, 13, 14, 15}};

        System.out.println(solve(matrix));

    }

    public static boolean solve(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int row1 = 0; row1 < row; row1++) {

            for (int col1 = 0; col1 < col; col1++) {

                if(matrix[row1][col1] == 51) {
                    return  true;
                };

            }

        }

        return false;
    }
}
