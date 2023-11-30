package playGround;

public class Storage {
    public static void main(String[] args) {

        String t = "1234";
        int b = Integer.valueOf(t);
        System.out.println(b);
        int a = Integer.parseInt(t);
        System.out.println(a);
        int c = 56;
        String s = String.valueOf(c);
        System.out.println(s);

        System.out.println(Math.cos(c));
        int tk = (int)Math.random();
        System.out.println(tk);
        int tm = (int)(11* 0.35);
        System.out.println(tm);

        double r = Math.random();
        int value = (int)(r);
        System.out.println(value* 4);
    }
}
