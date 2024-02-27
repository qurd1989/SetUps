package list;

import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySubsetOfAnotherArray {
    public static void main(String[] args) {

    }

    public String isSubset( long a1[], long a2[], long n, long m) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(a1[i]);
        }

        for (int i = 0; i<m; i++){
            if (list.contains(a2[i])){
                list.remove(a2[i]);
            }else
                return "No";
        }
        return "Yes";
    }

    static ArrayList<Integer> leaders(int arr[], int n){
        int currentLeader = 0;

        ArrayList<Integer> list  = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] >= currentLeader) {
                currentLeader = arr[i];
                list.add(currentLeader);
            }
        }
        Collections.reverse(list);
        return list;
    }
}