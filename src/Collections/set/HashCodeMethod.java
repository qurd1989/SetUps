package Collections.set;

public class HashCodeMethod {

    public static void main(String[] args) {


        int value = 234;

        System.out.println("HashCode value = " + value + ": " + Integer.hashCode(value));


        //Computing the hashCode of Intgere object

        Integer integer = Integer.valueOf("189");


        int hashValue = integer.hashCode();


        System.out.println("HashCode of val; " + hashValue);


    }
}
