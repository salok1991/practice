package facebook;

public class SparseVector {
    private  int[] arr;

    SparseVector(int[] nums)  {
        arr = nums;
    }

    // Return the dotProduct of two sparse vectors
    public  int dotProduct(SparseVector vec)  {
        int result =  0;
        for(int i =  0; i < arr.length; i++)  {
            result = result + arr[i] * vec.arr[i];
        }
        return result;
    }
}
