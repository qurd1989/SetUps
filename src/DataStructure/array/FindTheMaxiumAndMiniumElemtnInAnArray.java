package array;

public class FindTheMaxiumAndMiniumElemtnInAnArray {

    public static void main(String[] args) {
        int  arr = 100;

       int [] binaryArray =   solve(arr);

       for (int i = binaryArray.length-1; i >= 0; i--) {
           System.out.print(binaryArray[i]);
       }
    }

    // Decimal to Binary
    public  static int[] solve(int arr) {

        int temp [] = new int[8];
        int r =0;
        int i = 0;
        while ( arr != 0 ) {
            r = arr % 2;
            temp[i] = r;
            arr = arr /2;
            i++;

        }
        return temp;
    }


}
