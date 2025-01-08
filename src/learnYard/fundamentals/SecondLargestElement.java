package fundamentals;

public class SecondLargestElement {
    public static void main(String[] args) {

    }
    int secondLargestElement(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(n < 2){
            return -1;
        }
        for(int i= 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(secondLargest < arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
