package demo1;

public class Functions {

    public static void main(String[] args) {

        System.out.println(g());

    }


    static int f(int x) {

        return x * 2 - 1;


    }

    static int g() {
        int a = 3;
        int b = f(a) + f(4);
        System.out.println(b);
        return b;

    }
}
