package fundamentals;

public class PrintAllNegativeElements {
    public static void  main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5};
        PrintAllNegativeElements obj = new PrintAllNegativeElements();
        int[] result = obj.printAllNegativeElements(arr);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print(result[i] + " ");
            }
        }
    }
    public static int[] printAllNegativeElements(int[] arr) {
        int negativeArary[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeArary[i] = arr[i];
            }
        }
        return negativeArary;
    }
    public void dintuplicateZeros(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Traversing the array.
            if (arr[i] == 0) {
                for (int j = n - 2; j >= i; j--) {
                    arr[j + 1] = arr[j]; // Shifting The elements
                }
                i++; // incrementing i by 1
            }
        }
    }
}
