package facebook;

import java.util.*;

public class MismatchWords {

    static String[] mismatch() {
        String s1 = "apple apple";
        String s2 = "banana";

        Map<String, Integer> stringMap = new HashMap<>();

        for (String str1 : s1.split (" ")) {
            stringMap.put(str1, 1);
        }

        List<String> mismatchWords = new ArrayList<>();
        for (String str2 : s2.split (" ")) {
            if (stringMap.containsKey(str2)) {
                stringMap.put(str2, 2);
            }
            mismatchWords.add(str2);
        }

        stringMap.forEach((key, value) -> {
            if (value != 1) {
                mismatchWords.add(key);
            }
        });

        mismatchWords.forEach(System.out::println);
        return mismatchWords.toArray(new String[mismatchWords.size()]);
    }

    public static void main(String[] args) {
        MismatchWords.mismatch();
    }
}
