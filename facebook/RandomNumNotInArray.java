package facebook;

public class RandomNumNotInArray {
    boolean isExistsInArray()  {
        int[] arr =  {1,2,4,5,7,8,9};
        int start =  1;
        int  end  = 10;


        int randomNumber =  (int)  (Math.random() * (start  - end + 1))  +  1;
        System.out.println(randomNumber);

        for  (int i : arr)  {
            if  (i == randomNumber)  {
                System.out.println(true);
                return  true;
            }
        }
        System.out.println(false);
        return  false;
    }
}
