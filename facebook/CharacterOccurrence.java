package facebook;

public final class CharacterOccurrence {

    static int countCharacterOccurrence() {

        String str = "mississippi";
        char ch = 's';
        int charCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                charCount++;
            }
        }
        System.out.println(charCount);
        return charCount;
    }

    public static void main(String[] args) {
        CharacterOccurrence.countCharacterOccurrence();
    }
}
