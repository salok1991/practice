package facebook;

public class RemoveZeros {
    public void moveZeroes(int[] nums) {
        int numberOfZeros = 0;
        int index = 0;
        for(int zero : nums) {
            if(zero == 0) {
                numberOfZeros++;
            } else {
                nums[index] = zero;
                index++;
            }
        }

        for(int i = 0; i < numberOfZeros; i++) {
            nums[index] = 0;
            index++;
        }
    }
}
