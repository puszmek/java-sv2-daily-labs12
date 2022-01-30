package day05;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringStatistics {

    public Map<Character, Integer> numberOfCharacters(String str) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!result.containsKey(str.charAt(i))) {
                result.put(str.charAt(i), 1);
            } else {
                result.put(str.charAt(i), result.get(str.charAt(i)) + 1);
            }
        }
        return result;
    }
}
