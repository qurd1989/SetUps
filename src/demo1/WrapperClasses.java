package demo1;

public class WrapperClasses {


    public static void main(String[] args) {



        int  j = 8;

        Integer a = new Integer(12);

        System.out.println(a.hashCode());

        int  k = j + a;
        System.out.println(k);

        String s  = "1234";

        System.out.println(s);

        int b = Integer.parseInt(s);

        System.out.println(b);


        System.out.println(s.equals(b));


        int l1 = 42;

        double d1 = l1;

        System.out.println(d1);

        l1 = (int) d1;



    }
}
