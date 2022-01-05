package facebook;

import java.util.ArrayList;
import java.util.List;

public class IsPrime {
    List primeNumbersInRange() {
        int start = 1;
        int end = 100;

        List<Integer> primeNumbers = new ArrayList<>();

        for(int i = start; i < end; i++) {
            if (i == 0 || i == 1) {
                continue;
            }

            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            int primeFlag = 0;
            for (int j = 3; j <= Math.sqrt(i); j = j+2) {
                if (i % j == 0) {
                    primeFlag = 1;
                    break;
                }
            }
            if (primeFlag == 0) {
                primeNumbers.add(i);
            }

        }
        System.out.println(primeNumbers);
        return primeNumbers;
    }
}
