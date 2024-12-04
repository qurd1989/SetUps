package gfg160DayChallenge;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {

    }
    public List<Integer> findMajority(int[] nums){
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums){
            if (candidate1 == num){
                count1++;
            }else if (candidate2 == num){
                count2++;
            }else if (count1 == 0){
                candidate1 = num;
                count1 = 1;
            }else if (count2 == 0){
                candidate2 = num;
                count2 = 1;
            }else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums){
            if (num == candidate1){
                count1++;
            }else if (num == candidate2){
                count2++;
            }
        }
        List<Integer> majorityElements = new ArrayList<>();
        if (count1 > nums.length / 3){
            majorityElements.add(candidate1);
        }
        if (count2 > nums.length / 3){
            majorityElements.add(candidate2);
        }
        return majorityElements;
    }
}
