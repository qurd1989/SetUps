package arrays;

public class EmptyArray {


    public static void main(String[] args) {


        int numbers[] = { };

        if (numbers == null || numbers.length == 0)
            throw  new IllegalArgumentException("Array  null or Empty");
    }
}
