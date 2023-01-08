package math;

public class Matrix {


    public static void main(String[] args) {


        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
        {9, 10, 11, 12}}, temp;


        temp = arr[0][0];

        System.out.println("The matrix element are: ");
        printMatrix(arr);


        for (int row = 0; row < 3; row++) {

            for (int col = 0; col < 3; col++) {

                if (temp < arr[row][col])
                    temp  = arr[row][col];


            }
        }


        System.out.println("\nLargest element in the matrix is: " + temp);


    }


    public static void printMatrix(int arr[][]) {




        for (int i = 0; i < 3; i++) {
            System.out.println("\n");

            for (int j = 0; j < 4; j++) {

                System.out.print(arr[i][j] + " ");


            }
        }
        System.out.println("\n");
    }
}


