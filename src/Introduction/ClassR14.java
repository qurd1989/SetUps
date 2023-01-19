package Introduction;

public class ClassR14 {


    /*
    * Write a short Java method, isEven, that takes an int i and returns true if and only
      if i is even. Your method cannot use the multiplication, modulus, or division
      operators, however.
    * */
    public static void main(String[] args) {



        int i  = 4;

        System.out.println(isEven(i));

    }


    public static  boolean isEven(int i ) {


        return i % 2 ==0;
    }
}
