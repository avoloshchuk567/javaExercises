package vampireNumbers;

import org.slf4j.*;

public class VampireNumbersMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(VampireNumbersMain.class);

    public static void main(String[] args) {
        int rangeFrom = 1;
        int rangeTo = 9999;
        int digitCount = 0;
        boolean result;
        VampireNumbersDefinition definition = new VampireNumbersDefinition();

        for (int i = rangeFrom; i < rangeTo; i++) {
            char[] valueToDefine = Integer.toString(i).toCharArray();
            for (int j = 0; j < valueToDefine.length; j++) {
                digitCount++;
            }
            if ((digitCount % 2 == 1) || (digitCount == 2)) {
                digitCount = 0;
                continue;
            }
            digitCount = 0;
            result = definition.isVampire(valueToDefine, i);
            if (result) {
                LOGGER.info(i + " is a vampire number");
            }
        }
    }
}