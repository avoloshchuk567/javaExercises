package primeNumbers;

import java.util.*;

public class PrimeNumbersDefinition {
    private int numbersCounter = 0;
    private List<Integer> primeNumbersList = new ArrayList<>();

    public List<Integer> getPrimeNumbers(int to) {
        for (int i = 2; i <= to; i++) {
            for (int j = i; j > 0; j--) {
                if (i % j == 0) {
                    numbersCounter++;
                }
            }
            if (numbersCounter <= 2) {
                primeNumbersList.add(i);
            }
            numbersCounter = 0;
        }
        return primeNumbersList;
    }
}