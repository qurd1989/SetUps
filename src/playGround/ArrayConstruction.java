package playGround;

import java.util.Scanner;

public class ArrayConstruction {
   final static int MaxNumbers = 10;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] num = new int[MaxNumbers];
        System.out.printf("Type up to %d numbers followed byu 0\n", MaxNumbers);
        int n = 0;
        int v = in.nextInt();

        while (v != 0 && n < MaxNumbers) {
            num[n++] = v;
            v = in.nextInt();
        }
        if (v != 0) {
            System.out.printf("\nMore than %d numbers entered\n", MaxNumbers);
            System.out.printf("First %d used\n", MaxNumbers);
        }
        if (n == 0) {
            System.out.print("\nNo numbers supplied\n");
            System.exit(1);
        }
//n numbers are stored from num[0] to num[n-1]
        selectionSort(num, 0, n-1);
        System.out.print("\nThe sorted numbers are\n");
        for (v = 0; v < n; v++) System.out.printf("%d ", num[v]);
        System.out.print("\n");


    } //end main
// selectionSort, getSmallest and swap go here
public static void selectionSort(int[] list, int lo, int hi) {
//sort list[lo] to list[hi] in ascending order
    for (int h = lo; h < hi; h++) {
        int s = getSmallest(list, h, hi);
        swap(list, h, s);
    }
}
    public static int getSmallest (int[] list, int lo, int hi){
//return location of smallest from list[lo..hi]
        int small = lo;
        for (int h = lo + 1; h <= hi; h++)
            if (list[h] < list[small])
                small = h;
        return small;
    }

    public static void swap(int[] list, int i, int j) {
//swap elements list[i] and list[j]
        int hold = list[i];
        list[i] = list[j];
        list[j] = hold;
    }
}


