package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {

    //    Set<Integer> nonDuplicateValues = new HashSet<>(input);
//    System.out.println(new ArrayList<>(nonDuplicateValues));
//    return new ArrayList<>(nonDuplicateValues);
    List<Integer> removeDuplicateFromList() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 4, 5, 7, 2, 3, 0, 4, 2, 4));

        Collections.sort(input);
        int i = 0;
        int j = 1;
        while (j < input.size()) {
            if (input.get(i) == input.get(j)) {
                input.set(i, null);
            }
            i++;
            j++;

        }
        int k = 1;
        int replace = 0;
        while (k < input.size()) {
            if (input.get(replace) == null && input.get(k) != null) {
                input.set(replace, input.get(k));
                input.set(k, null);
            }
            if (input.get(replace) != null) {
                replace++;
            }
            k++;
        }
        for (int m = replace; m < input.size(); ) {
            input.remove(m);
        }
        return input;
    }
}
