package vampireNumbers;

import org.slf4j.*;

import java.util.stream.*;

public class VampireNumbersMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(VampireNumbersMain.class);

    public static void main(String[] args) {
        int rangeFrom = 1;
        int rangeTo = 10000;
//        int digitCount = 0;
        VampireNumbersDefinition definition = new VampireNumbersDefinition();

        /*for (int i = rangeFrom; i < rangeTo; i++) {
            char[] valueToDefine = Integer.toString(i).toCharArray();
            for (int j = 0; j < valueToDefine.length; j++) {
                digitCount++;
            }
            if ((digitCount % 2 == 1) || (digitCount == 2)) {
                digitCount = 0;
                continue;
            }
            digitCount = 0;
            if (definition.isVampire(valueToDefine, i)) {
                LOGGER.info(i + " is a vampire number");
            }
        }*/
        LOGGER.info(IntStream.range(rangeFrom, rangeTo)
                .mapToObj(i -> Integer.toString(i).toCharArray())
                .filter(e -> e.length > 3)
                .filter(e -> definition.isVampire(e, Integer.parseInt(String.valueOf(e))))
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }
}