package arrays;

public class ArrayClone {

    public static void main(String[] args) {


                int[] ia1 = { 1, 2 };
                int[] ia2 = ia1.clone();
                System.out.print((ia1.equals(ia2))+ " ");
                ia1[1]++;
                System.out.println(ia2[1]);
            }


}
