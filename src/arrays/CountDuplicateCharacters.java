package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateCharacters {
    public static void main(String[] args) {
        String input = "programming";

        // Using countDuplicteCharacters
        Map<Character, Integer> result1 = countDuplicteCharacters1(input);
        System.out.println("Using countDuplicteCharacters:");
        result1.forEach((k, v) -> System.out.println(k + ": " + v));


    }
    public static Map<Character, Integer> countDuplicteCharacters(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        result.entrySet().removeIf(entry -> entry.getValue() <= 1);
        return result;
    }

    public static Map<Character, Integer> countDuplicteCharacters1(String s) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            result.put(ch, result.getOrDefault(ch, 0) +1);
        }
        Map<Character, Integer> filteredResult = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() > 1) {
                filteredResult.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredResult;
    }

}

