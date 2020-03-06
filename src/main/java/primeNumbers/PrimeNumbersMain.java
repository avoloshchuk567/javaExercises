package primeNumbers;

import java.util.List;

public class PrimeNumbersMain {
    public static void main(String[] args) {
        int to = 50;

        PrimeNumbersDefinition definePrimeNumbers = new PrimeNumbersDefinition();
        List<Integer> list = definePrimeNumbers.getPrimeNumbers(to);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}