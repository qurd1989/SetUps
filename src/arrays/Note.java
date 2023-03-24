package arrays;

public class Note {

    public static void main(String[] args) {

        char[] alphabet  = new char['z' - 'a' + 1];

        for (char cx = 'a';   cx <= 'z'; cx++) {

            alphabet[cx - 'a' ] = cx;


            System.out.println(alphabet);
        }
    }
}
