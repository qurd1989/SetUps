package string;

public class ReverseLettersAndWords {
    private static final String WHITESPACE = " ";
    public static void main(String[] args) {


    }

    public static String reverseWords(String str ){
        StringBuilder sb = new StringBuilder();
        String []words = str.split(WHITESPACE);

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length()-1; i > 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            sb.append(reversedWord).append(WHITESPACE);
        }
        return sb.toString();
    }

}
