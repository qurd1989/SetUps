package fundamentals;

public class Arrays {
    public static void main(String[] args) {
        int arr[] = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        Arrays obj = new Arrays();
        obj.pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the end: ");
    }
    public void pushZerosToEnd(int arr[], int n) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while(count < n) {
            arr[count++] = 0;
        }
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
