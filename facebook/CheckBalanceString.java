package facebook;

public class CheckBalanceString {
    int checkBalanceString() {
        String str = "1aba0";
        int charCount = 0;
        int numberCount = 0;

        for(int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);
            if (Character.isDigit(charAtIndex)) {
                numberCount++;
            } else if (Character.isAlphabetic(charAtIndex) && (int) charAtIndex >= 97 && (int) charAtIndex <=106) {
                charCount++;
            }
        }

        int result = charCount % 2 + numberCount %2;
        if (!Character.isAlphabetic(str.charAt(0))) {
            result = result + (charCount % 2 == 0 ? 2 : 1);
        }

        if (! Character.isDigit(str.charAt(str.length()-1))) {
            result = result + (numberCount % 2 == 0 ? 2 : 1);
        }

        return result;
    }
}
