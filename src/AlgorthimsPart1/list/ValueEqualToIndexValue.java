package list;

import java.util.ArrayList;
import java.util.Arrays;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i< n; i++){
            if (arr[i] == i){
                list.add(i);
            }
        }
        return list;
    }
}
