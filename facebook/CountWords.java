package facebook;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    String countString() {
        String str = "I am back.";
        Map<Character, Integer> charCounting = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            charCounting.put(str.charAt(i), charCounting.getOrDefault(str.charAt(i), 0) + 1);
        }

        String result = charCounting.entrySet().stream().map(e -> e.getKey() + "" + e.getValue()).collect(Collectors.joining());
        System.out.println(result);
        return null;
    }
}
