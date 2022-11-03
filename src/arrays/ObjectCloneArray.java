package arrays;

public class ObjectCloneArray {


    public static void main(String[] args) {


        int intArray[][] = {{1,2,3,45}, {4,5,7}};

        int cloneArray[][] = intArray.clone();


        //will print false or true?

        System.out.println(intArray == cloneArray);

        System.out.println(intArray[0] == cloneArray[0]);

        System.out.println(intArray[1] == cloneArray[1]);

    }
}



