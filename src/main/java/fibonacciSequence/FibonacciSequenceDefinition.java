package fibonacciSequence;

import java.util.*;

public class FibonacciSequenceDefinition {
    private int number = 0;
    private List<Integer> fibonacciSequence = new ArrayList<>();

    public List<Integer> defineFibonacciSequence(int number) {
        this.number = number;
        int sum;

        if (number == 1) {
            fibonacciSequence.add(1);
            return fibonacciSequence;
        } else if (number >= 2) {
            fibonacciSequence.add(1);
            fibonacciSequence.add(1);

            for (int i = 2; i < number; i++) {
                sum = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
                fibonacciSequence.add(sum);
            }
            return fibonacciSequence;
        } else {
            throw new RuntimeException("Incorrect input");
        }
    }
}