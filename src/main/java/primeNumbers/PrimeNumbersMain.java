package primeNumbers;

import org.slf4j.*;

import java.util.stream.*;

public class PrimeNumbersMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrimeNumbersMain.class);

    public static void main(String[] args) {
        int to = 30;

        PrimeNumbersDefinition definePrimeNumbers = new PrimeNumbersDefinition();

        LOGGER.info(definePrimeNumbers.getPrimeNumbers(to)
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

//      list.stream().forEach(System.out::println);
    }
}