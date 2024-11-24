package gfg160DayChallenge;

public class RotateArray {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr(arr, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void rotateArr(int arr[], int d){
        int n = arr.length;
        swap(arr, 0, d - 1); // Swap the first part
        swap(arr, d, n - 1); // Swap the second part
        swap(arr, 0, n - 1); // Swap the entire array
    }
    public static void swap(int arr[], int start, int end){
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
