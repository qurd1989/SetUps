package arrays;

public class SearchInsertPosition {

    public static void main(String[] args) {

        int target = 5;
        int [] nums = {1};

        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {


        int n = nums.length;

        int left = 0; int right = n-1;

        for(int mid = 1; left <=right; mid = right +(right-left)/2) {

            if(nums[mid] == target) {
                return mid;

            }
            else if(nums[mid] < target) {

                left = mid + 1;

            }else{
                right = mid -1;

            }

        }

        return left;
    }
}
