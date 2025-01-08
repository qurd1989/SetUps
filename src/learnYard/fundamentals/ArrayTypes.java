package fundamentals;

public class ArrayTypes {
    public static void main(String[] args) {
        ArrayTypes obj = new ArrayTypes();
        System.out.println(obj.arrayTypes());

    }
    String arrayTypes() {
        // 1. Array of primitive data types
        int[] arr = new int[5];
        // 2. Array of objects
        String[] str = new String[5];
        // 3. Array of arrays
        int[][] arr2 = new int[5][5];
        // 4. Array of objects
        String[][] str2 = new String[5][5];
        // 5. Array of objects
        String[][][] str3 = new String[5][5][5];
        // 6. Array of objects
        String[][][][] str4 = new String[5][5][5][5];
        // 7. Array of objects
        String[][][][][] str5 = new String[5][5][5][5][5];
        // 8. Array of objects
        String[][][][][][] str6 = new String[5][5][5][5][5][5];

        return "Array types initialized";
    }
}
