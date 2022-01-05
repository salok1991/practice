package facebook;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class FlattenList {
    List flattenParentList() {
        List intList = asList(
                1, 2,
                asList(3,4,
                        asList(5),
                        asList(6, 7,
                                asList(8,
                                        asList(9))))
        );

        List<Integer> flattenList = new ArrayList<>();
        flattenList(intList, flattenList);
        return flattenList;
    }

    void flattenList(List input, List output) {
        for (int j = 0; j < input.size(); j++) {
            if (input.get(j) instanceof List) {
                flattenList((List) input.get(j), output);
            } else {
                output.add(input.get(j));
            }
        }
    }
}
