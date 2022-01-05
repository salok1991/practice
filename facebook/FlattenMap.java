package facebook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlattenMap {
    Map flattenMap() {
        Map nonFlatMap = Map.of("x1", 1, "x2", 2, "x3", 3,
                "a", 1,
                "c", Map.of("a", 2,
                        "b", Map.of("x", 5, "y", 10)),
                "d", Arrays.asList(1, 2, 3));


        Map flattenMap = new HashMap<>();

        flattenMapFun(nonFlatMap, flattenMap);

        flattenMap.entrySet().forEach(System.out::print);
        return flattenMap;
    }

    void flattenMapFun(Map nonFlattenMap, Map flattenMap) {
        Iterator<Map.Entry> iterator = nonFlattenMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            var key = entry.getKey();
            var value = entry.getValue();
            try {
                if(value instanceof Map) {
                    flattenMapFun((Map) value, flattenMap);
                } else {
                    flattenMap.put((String) key, value);
                }
            } catch (ClassCastException e) {
                System.out.println(e.toString());
                throw new ClassCastException(e.toString());
            }
        }
    }
}
