package string;

public class ReverseWordsInString {
    public static void main(String[] args) {

    }

    public static String reverseWordInAString(String s) {
        String [] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }



}
