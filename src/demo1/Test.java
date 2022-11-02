package demo1;

public class Test {

    public static void main(String[] args) {

        int max = 1;
        System.out.println(max);
        max(1,2,max);
        System.out.println(max);

    }

    public static void max(int val1, int val2, int max) {
        if (val1 > val2)
            max = val1;
        else
            max = val2;
    }
}
