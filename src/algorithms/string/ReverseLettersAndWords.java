package string;

public class ReverseLettersAndWords {
    private static final String WHITESPACE = " ";
    public static void main(String[] args) {
        String str = "Elmar is not the same guy!";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String str ){
        StringBuilder reverseString = new StringBuilder();
        String []words = str.split(WHITESPACE);

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder();
            for (int i = word.length()-1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reverseString.append(reversedWord).append(WHITESPACE);
        }
        return reverseString.toString();
    }

}
