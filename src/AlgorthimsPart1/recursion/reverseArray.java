package recursion;

public class reverseArray {
    public static void main(String[] args) {

        int[] p = {2,3,4,5,6,7,8};
        int n = p.length-1;

        int[] arr = solve(p, 0,n);

        for (int i = 0; i <= n; i++){
            System.out.print(arr[i] +  " ");
        }
    }
    public static int[] solve(int[] arr, int start, int end) {

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       return arr;
    }

}
