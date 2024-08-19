package array;

public class TwoDimensionalArray {
    public static void main(String[] args){
        int [] []m = new int[5][5];
        for(int i = 0; i< 5; i++){
          m[0][i] = i;
          m[i][i] = 2*i;
            System.out.println(m[0][i]);
        }
    }

}
