package facebook;

import java.util.HashMap;
import java.util.Map;

public class PersonFriends {
    Map<String, Integer> friendCount() {
        String[][] str = { {"1", "2"}, {"2", "3"}, {"3", "4"}, {"5"}, {"2", "4"}, {"6"} };

        Map<String, Integer> friendCount =  new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if(str[i].length > 1) {
                friendCount.put(str[i][0], friendCount.getOrDefault(str[i][0], 0) + 1);
                friendCount.put(str[i][1], friendCount.getOrDefault(str[i][1], 0) + 1);
            } else {
                friendCount.put(str[i][0], friendCount.getOrDefault(str[i][0], 0));
            }

        }

        friendCount.entrySet().forEach(System.out::println);
        return friendCount;
    }

    public static void main(String[] args) {
        PersonFriends personFriends = new PersonFriends();
        personFriends.friendCount();
    }
}
