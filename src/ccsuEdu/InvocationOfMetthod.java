package ccsuEdu;

public class InvocationOfMetthod {

    public static void main(String[] args) {

        /*
        Which method will be  invoked first
         */

        double z = m(4, 5);
        double z1 = m(4, 5.4);
        double z2 = m(4.5, 5.4);

    }


    public static double m(double x, double y) {

        System.out.println("First method");
        return x+y;

    }
    public static double m(int x, double y){

        System.out.println("Second method");

        return x+y;



}
}
