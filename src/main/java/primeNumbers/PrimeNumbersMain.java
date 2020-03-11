package primeNumbers;

import org.slf4j.*;

import java.util.List;

public class PrimeNumbersMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrimeNumbersMain.class);

    public static void main(String[] args) {
        int to = 50;

        PrimeNumbersDefinition definePrimeNumbers = new PrimeNumbersDefinition();
        List<Integer> list = definePrimeNumbers.getPrimeNumbers(to);

        for (int i : list) {
            LOGGER.info(i + "");
        }
    }
}