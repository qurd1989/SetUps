package arrays;

import java.util.Arrays;

public class REmovingArray {


    public static void main(String[] args) {


        char[] insert = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};

        System.out.println("Initial array:");
        for (int i = 0; i < insert.length; i++) {
            System.out.print(insert[i] + " ");
        }
        System.out.println();

        insertionSort(insert);

        System.out.println("Sorted array:");
        for (int i = 0; i < insert.length; i++) {
            System.out.print(insert[i] + " ");
        }
        System.out.println();
    }

    public static boolean insertionSort(char[] data) {

        int n = data.length;

        for (int i = 1; i < n; i++) {

            char cur = data[i];

            int j = i;
            while (j > 0 && data[j - 1] > cur) {

                data[j] = data[j - 1];
                j--;

            }
            data[j] = cur;


        }
        return false;
    }
}
