package demo1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertingSecondsToHours {


    public static void main(String[] args) {

        test();


        int h = 0;
        int m = 1;
        int s = 1;


        System.out.println(time(h, m, s));


    }


    static int time(int h, int m, int s) {


        m += h;
        s += 60;
        return s * 1000;


    }


    public static String repeat(final int repeat, final String string) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < repeat; i++) {

            sb.append(string);

        }

        return sb.toString();


    }



    @Test

    public  static void test() {

        assertEquals("aaa", ConvertingSecondsToHours.repeat(3, "a"));



    }

}
