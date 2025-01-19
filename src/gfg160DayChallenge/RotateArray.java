package gfg160DayChallenge;

public class RotateArray {
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        rotateArr1(arr, d);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void rotateArr(int arr[], int d){
        int n = arr.length;
        d %= n;
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
    static void rotateArr2(int arr[], int d) {

    }
    static void rotateArr1(int[] arr, int d) {
        int n = arr.length;

        // Repeat the rotation d times
        for (int i = 0; i < d; i++) {

            // Left rotate the array by one position
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

}
