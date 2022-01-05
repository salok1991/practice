package facebook;

public class Palindrome {
    boolean isPalindrome() {
        String str = " abba ";
        int length = str.length();

        for (int i = 0; i < length/2; i++) {
            if ( ! (str.charAt(i) == str.charAt(length-i-1))) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
