package facebook;

public final class Monotonic {

    static boolean isMonotonic() {
        int[] arr = {1, 4, 6, 3};
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1] ) {
                increasing = false;
            }
            if (arr[i] < arr[i+1]) {
                decreasing = false;
            }
            if (! (increasing || decreasing)) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        Monotonic.isMonotonic();
    }
}
