package facebook;

import java.util.*;

public class BalanceList {
    Map balanceList() {
        List<Integer> input = Arrays.asList(1, 1, 1, 5, 3, 2, 2);
        int maxOccurrence = 0;
        Map<Integer, Integer> occurrence = new HashMap<>();

        for (Integer i : input) {
            int existingOccurrence = occurrence.getOrDefault(i, 0);
            occurrence.put(i, existingOccurrence + 1);
            maxOccurrence = Math.max(maxOccurrence, existingOccurrence+1);
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = occurrence.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if(entry.getValue() == maxOccurrence) {
                iterator.remove();
            } else {
                entry.setValue(maxOccurrence - entry.getValue());
            }
        }

        occurrence.entrySet().forEach(System.out::println);
        return occurrence;
    }
}
