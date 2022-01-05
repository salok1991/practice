package facebook;

import java.util.ArrayList;
import java.util.List;

public class CountAllSubstrings {
    int countAllSubstring() {
        String str = "abcd";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }

        return 0;
    }

    int countAllSubstringWithoutSubStr() {
        String str = "abcd";
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                temp.append(str.charAt(j));
                strList.add(temp.toString());
            }
        }
        System.out.println(strList);
        return 0;
    }
}
