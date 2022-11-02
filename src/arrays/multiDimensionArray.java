package arrays;

public class multiDimensionArray {

    public static void main(String[] args) {

        //two dimensionla array
        int [][] arr = {{1,2,3,4,5}, {2,4,0,6,7}, {2,4,7,0,9}, {55,6,7,8,93}};

        // 3D array
        int [][][] arr1 = new int[10][20][30];



        for (int i = 0; i< 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(arr[i][j] + " ");


            System.out.println();
            }




    }
}
