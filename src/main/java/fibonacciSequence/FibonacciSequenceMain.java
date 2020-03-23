package fibonacciSequence;

import org.slf4j.*;

import java.util.stream.*;

public class FibonacciSequenceMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(FibonacciSequenceMain.class);

    public static void main(String[] args) {
        int to = 11;
        FibonacciSequenceDefinition definition = new FibonacciSequenceDefinition();

        LOGGER.info(definition.defineFibonacciSequence(to)
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

//        for (int i : fibonacciSequence) {
//            LOGGER.info(i + "");
//        }
    }
}
