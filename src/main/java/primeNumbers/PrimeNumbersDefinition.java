package primeNumbers;

import java.util.*;
import java.util.stream.*;

public class PrimeNumbersDefinition {
// the old code
        /* public List<Integer> getPrimeNumbers(int to) {
        for (int i = 2; i <= to; i++) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    numbersCounter++;
                }
            }
            if (numbersCounter == 0) {
                primeNumbersList.add(i);
            }
            numbersCounter = 0;
        }
        return primeNumbersList;
    }*/

    public List<Integer> getPrimeNumbers(int to) {
        return Stream.iterate(2, i -> i <= to, i -> i + 1)
                .filter(PrimeNumbersDefinition::isPrime)
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
//        int numbersCounter = 0;
//        for (int j = number - 1; j > 1; j--) {
//            if (number % j == 0) {
//                numbersCounter++;
//            }
//        }
//        return (numbersCounter == 0);
        return (IntStream.range(2, number)
                .filter(i -> number % i == 0)
//                .limit(number)
                .count()) == 0;
    }
}