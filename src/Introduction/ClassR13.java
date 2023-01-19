package Introduction;

public class ClassR13 {


/*
* Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
* */
    public static void main(String[] args) {


        int m = 15;

        int n = 3;

        System.out.println(isMultiple(m,n));

    }


    public static boolean isMultiple(long m, long n) {


        int  i = 1;
        boolean result = false;


        while (m >= n * i) {
            if (m == n * i)
                result = true;
            i++;


        }

        return result;


    }
}
