package hashing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHashSet {
    private boolean[] set;
    public MyHashSet() {
        set = new boolean[1000001];
    }
    public void add(int key) {
        set[key] = true;
    }
    public void remove(int key) {
        set[key] = false;
    }
    public boolean contains(int key){
        return false;
    }
    public static void main(String[] args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        System.out.println(hashSet.contains(3));
        System.out.println(hashSet.contains(4));
        hashSet.remove(4);
        System.out.println(hashSet.contains(4));


    }

    boolean findDuplicate(List<Integer> keys){
        Set<Integer> set = new HashSet<>();
        for(int key : keys){
            if (set.contains(key)){
                return true;
            }
            set.add(key);
        }
        return false;
    }

}
