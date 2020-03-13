package vampireNumbers;

import org.slf4j.*;

import java.util.*;

public class VampireNumbersDefinition {
    private static final Logger LOGGER = LoggerFactory.getLogger(VampireNumbersDefinition.class);
    private boolean isVampireResult;

    private boolean getFangs(char[] value, int initialValue) {
        Permutation.permute(value);
        Set<String> permutedNumbers = Permutation.result;
        Iterator iterator = permutedNumbers.iterator();
        while (iterator.hasNext()) {
            String[] ab = iterator.next().toString().split("");
            String[] a = {ab[0], ab[1]};
            String[] b = {ab[2], ab[3]};
            if ((a[1].equals("0") && b[1].equals("0")) || (a[0].equals("0") || b[0].equals("0"))) {
                continue;
            } else {
                int firstFang = Integer.parseInt(a[0] + a[1]);
                int secondFang = Integer.parseInt(b[0] + b[1]);
                if (firstFang * secondFang == initialValue) {
                    LOGGER.debug("FirstFang = {}, SecondFang = {}", firstFang, secondFang);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isVampire(char[] c, int number) {
        if (number < 1000 || number > 9999) {
            throw new RuntimeException("The number is incorrect");
        }
        isVampireResult = getFangs(c, number);
        if (isVampireResult) {
            return true;
        }
        return false;
    }
}
