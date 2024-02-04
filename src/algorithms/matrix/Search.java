package matrix;

public class Search {

    public static void main(String[] args) {
        int x = 8;
        int [][]arr = {{0,6,9,9,11},
                {20,22,21,23,34}};
        if (searchInMatrix(arr,x)){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
    static boolean searchInMatrix(int[][]arr, int x){
        int n = arr.length, m= arr[0].length;
        for (int i =0; i < n; i++){
            for (int j = 0; j <m; j++){
                if (arr[i][j] == x){
                    return true;
                }
            }
        }
        return false;
    }

}
