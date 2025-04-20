package hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {

    }
    public  static char firstNonRepeatingElement(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getKey() == 1) {
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    public static char firAChar() {
        return Character.MIN_VALUE;
    }

}
