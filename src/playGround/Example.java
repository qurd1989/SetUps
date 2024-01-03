package playGround;

public class Example {
    public static void main(String[] args) {
        int x = 100;

        System.out.println(evenFib(x));
        System.out.println("Elmar");
    }
    static int evenFib(int n) {
        if (n<1){
            return n;
        }
        if (n ==1) {
            return 2;
        }
        return ((4 * evenFib(n-1)) + evenFib(n-2));
    }

}
