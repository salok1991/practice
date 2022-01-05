package facebook;

public class CountWord {
    int countWord() {
        String str = "I am a good  guy";


        String[] strArray = str.split("\\s+");

        // String[] strArray = str.split(" ");
        // If you use " " for split then this will count additional characters if more than one space if there

        int count = 0;
        int sumOfWordLength = 0;
        for (String value : strArray) {
            count++;
            sumOfWordLength  += value.length();
        }

        int averageWordLength = sumOfWordLength/count;

        // float averageWordLength = (float) sumOfWordLength/count;
        // Use this want average in decimal

        return count;

    }
}
