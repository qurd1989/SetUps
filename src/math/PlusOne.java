package math;

public class PlusOne {
    public static void main(String[] args) {

        int arr[] = {2,4,5,6,7,8,9,0,2};
        int result[] = plusOne(arr);
        for (int i = 0; i <arr.length; i++){
            System.out.print(result[i]+ " ");
        }
    }

    static public int[] plusOne(int []digits){
        for (int i = digits.length -1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int [] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

}
