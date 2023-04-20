package programs;

public class UniqeCharactersInString {

    public static void main(String[] args) {

        System.out.println(findUniqueCharacterInString("LeetCode"));
        System.out.println(findUniqueCharacterInString("loveleetcode"));
    }

    private  static int findUniqueCharacterInString(String str) {
        int [] charCount = new int[26];

        for (int i =0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);

            }
            if (c >= 'a' && c <= 'z') {
                charCount[c - 'a']++;
            }
        }
        for (int i = 0; i <str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            if (charCount[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
