package arrays;

public class FindingMaxNum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 778, 97, 643, 34, -1234};

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }

        }
        System.out.println("min " + min);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];

            }


        }
        System.out.println("max " + max);
    }
}
