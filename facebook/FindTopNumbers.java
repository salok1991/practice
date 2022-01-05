package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTopNumbers {
    List findTopNNumbers() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(81, 52, 45, 10, 3, 2, 96));
        int n = 5;
        if(n > inputList.size()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>(n);

        int maxIndex = -1;
        for (int i = 0; i < n; i++) {
            int max = 0;

            for (int j = 0; j < inputList.size(); j++) {
                if(inputList.get(j) > max) {
                    max = inputList.get(j);
                    maxIndex = j;
                }
            }
            result.add(max);
            inputList.remove(maxIndex);
        }
        System.out.println(result);
        return result;

    }
}
