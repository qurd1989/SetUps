package hashing;

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
}
