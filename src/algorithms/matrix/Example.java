package matrix;

import java.text.AttributedCharacterIterator;
import java.util.HashMap;

public class Example {

    public static void main(String[] args) {

    }

    public static int numTilePossibilities(String tiles) {
        HashMap<String, Integer> countMap = new HashMap<>();

        if (tiles.isEmpty()){
            return 1;
        }
        if (countMap.containsKey(tiles)) {
            return countMap.get(tiles);
        }

        int result = 0;
        for (int i = 0; i < tiles.length(); i++) {
            String remaining = tiles.substring(0, i) + tiles.substring(i + 1);
            result += numTilePossibilities(remaining);
        }

        countMap.put(tiles, result);
        return result;
    }
}
