package intermediat2;

public class toLowerCase {

    public static void main(String[] args) {

    }

    public char[] to_lower(char[] A) {

        int n = A.length;
        char result[] = new char[n];


        for (int i = 0; i < n; i++) {

            if (Character.isUpperCase(A[i])) {

                result[i] = (char) (A[i] + 32);


            } else

                result[i] = A[i];


    }
    return result;
}
}
