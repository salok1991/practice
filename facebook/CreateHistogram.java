package facebook;

import java.util.Arrays;
import java.util.List;

public class CreateHistogram {
    void createHistogram()  {
        List<Integer> input =  Arrays.asList(1,4,5,7,2,3,0,4);
        for  (int i =  0; i < input.size(); i++)  {
            int j = input.get(i);
            while  (j >  0)  {
                System.out.print("");
                j--;
            }
            System.out.println();
        }
    }
}
