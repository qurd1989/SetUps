package intermediate1;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {

                char ch = sb.charAt(i);
                char ch1  = sb.charAt(j);

                if ( ch == ch1){

                    return true;

                }
            }
        }
        return false;
    }
}
