package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceNullWithPrevious {
    static List<Integer> inputList = new ArrayList<>();

    static {
        inputList.add(null);
        inputList.add(1);
        inputList.add(null);
        inputList.add(null);
        inputList.add(5);
    }

    static List<Integer> nullReplaced() {

        for (int i = 1; i < inputList.size(); i++) {
            if ( inputList.get(i) == null) {
                inputList.set(i, inputList.get(i-1));
            }
        }
        inputList.forEach(System.out::println);
        return inputList;
    }

    public static void main(String[] args) {
        ReplaceNullWithPrevious.nullReplaced();
    }
}
