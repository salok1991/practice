package facebook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class NthHighestValue {

    static String nthHighestValue() {

        int n = 9;
        Map<String, String> map = new HashMap<>();
        map.put("z", "10");
        map.put("b", "5");
        map.put("a", "6");
        map.put("c", "20");
        map.put("d", "1");
        map.put("e", "7");
        map.put("y", "8");
        map.put("n", "99");
        map.put("g", "50");
        map.put("m", "2");
        map.put("l", "2");
        map.put("p", "2");
        map.put("f", "9");

        if (n > map.size()) {
            return null;
        }

        List<Map.Entry<String, String>> sortedList = map.entrySet()
                .stream().sorted(Map.Entry.<String, String>comparingByValue().reversed())
                .collect(Collectors.toList());

        int highestCount = 1;
        String nthHighestValue = null;

        for (int i = 1; i < sortedList.size(); i++) {
            if (!(sortedList.get(i).getValue().equals(sortedList.get(i - 1).getValue()))) {
                highestCount++;
                if (highestCount == 10) {
                    return nthHighestValue;
                }
            }

            if (highestCount == 9) {
                if (nthHighestValue == null) {
                    nthHighestValue = sortedList.get(i).getKey();
                } else {
                    nthHighestValue = nthHighestValue.compareTo(sortedList.get(i - 1).getKey()) > 0 ? sortedList.get(i - 1).getKey() : nthHighestValue;
                }
            }
        }

        return nthHighestValue;
    }

    public static void main(String[] args) {
        System.out.println(NthHighestValue.nthHighestValue());
    }
}
