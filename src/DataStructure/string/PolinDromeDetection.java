package string;

public class PolinDromeDetection {

    public static void main(String[] args) {
        String[] testStrings = {
                "aabcccccaaa",
                "abcd",
                "aaaaaa",
                "abbcccaa",
                "",
                "a"
        };

        for (String s : testStrings) {
            String compressed = stringCompression(s);
            System.out.println("Original: \"" + s + "\", Compressed: \"" + compressed + "\"");
        }

    }
    public static boolean palindrome(String s) {

        int l = 0, r = s.length()-1;
        while (l < r) {
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            while (Character.isLetterOrDigit(s.charAt(r))) {
                if (s.charAt(l) != s.charAt(r)){
                    return false;
                }
                r--;
            }
        }
        return true;
    }

    public static String stringCompression(String s)  {
        int n = s.length();
        if (n == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < n-1; i++) {
            char value = s.charAt(i);
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(value);
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }
            sb.append(s.charAt(n - 1));
            if (count > 1) {
                sb.append(count);

        }
            String compressed  = sb.toString();
            return compressed.length() < n ? compressed : s;

    }

}
