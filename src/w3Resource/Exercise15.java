package w3Resource;

public class Exercise15 {

    public static void main(String[] args) {


        int a = 15;
        int b = 25;

        System.out.println("Before swap");
        System.out.println("a =  "+ a);
        System.out.println("b = " + b);

        int temp = a;
        a=b;
        b=temp;


        System.out.println("after swap");
        System.out.println("a =" + a);
        System.out.println("b = " +b);
    }
}
