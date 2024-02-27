package sorting;

public class CompareIt implements Comparable<CompareIt>{
    int x;
    int y;
    public CompareIt(int x, int  y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(CompareIt it){
        return Integer.compare(x, it.x);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        CompareIt it = new CompareIt(x, y);
        it.compareTo(it);
        System.out.println(it);

    }
}
