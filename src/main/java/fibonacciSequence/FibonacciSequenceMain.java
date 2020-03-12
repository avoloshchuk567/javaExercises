package fibonacciSequence;

import org.slf4j.*;

import java.util.*;

public class FibonacciSequenceMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(FibonacciSequenceMain.class);

    public static void main(String[] args) {
        int to = 10;
        FibonacciSequenceDefinition definition = new FibonacciSequenceDefinition();
        List<Integer> fibonacciSequence = definition.defineFibonacciSequence(to);

        for (int i : fibonacciSequence) {
            LOGGER.info(i + "");
        }
    }
}
