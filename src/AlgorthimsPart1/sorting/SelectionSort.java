package sorting;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {1,3,4,3,2,65,12,23,45};
        int lo = 0;
        int hi = arr.length-1;

         int[] result = solve(arr, lo, hi);
         for (int nusm : result){
             System.out.print(nusm +  " ");
         }
    }

    public static int[] solve(int[] lsit, int lo, int hi){
        for (int i = lo; i < lsit.length-1; i++){
            int n = getSmallest(lsit, lo, hi);
            swap(lsit, n, hi);
            lo++;
            hi--;

        }

        return lsit;
    }
    public static int getSmallest(int[] arr, int l, int h){
        int small = l;
        for (int i = l; i<=h; i++){
            if (arr[i] <arr[small]){
                small = i;
            }
        }
        return small;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
