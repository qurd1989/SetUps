package twoPointer;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4};
        int arr1[] = {2, 6, 7,2};
        int m = arr.length;
        int n = arr1.length;

        merge1(arr, n, arr1, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0, j = 0, k = 0;
        int[] nums3 = new int[n + m];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                i++;
                k++;
            } else {
                nums3[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            nums3[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            nums3[k] = nums2[j];
            j++;
            k++;
        }
        for (int l = 0; l < n + m; l++) {
            nums1[l] = nums3[l];
        }
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    public void mergeTWo(int[] nums1, int m, int[] nums2, int n) {
        int k1 = m-1;
        int k2 = n-1;
        for(int i = n + m-1; i >= 0; i--) {
            if (k2 < 0) {
                break;
            }
            if (k1 >=0 && nums1[k1] > nums2[k2]){
                nums1[i] = nums1[k1--];

            }else
                nums1[i] = nums2[k2--];

        }
}
    class Solution {
        public boolean isPalindrome(String s) {
            if (s == null || s.length() == 0)
                return true;

            int r = s.length() - 1;
            for (int l = 0; l < s.length(); l++) {
                if (!Character.isLetterOrDigit(s.charAt(l)))
                    continue;
                while (r > l && !Character.isLetterOrDigit(s.charAt(r)))
                    r--;
                if (l <= r && Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                    return false;
                r--;
            }

            return true;
        }
    }}