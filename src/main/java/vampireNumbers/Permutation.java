package vampireNumbers;

import org.slf4j.*;

import java.util.*;

public class Permutation {
    private static final Logger LOGGER = LoggerFactory.getLogger(Permutation.class);
    static Set<String> result = new HashSet<>();

    public static void permute(char[] value) {
        if (!(result.isEmpty())) {
            result.clear();
        }
        permute(value, value.length);
    }

    private static void permute(char[] a, int n) {
        if (n == 1) {
//           LOGGER.debug(new String(a));
            result.add(new String(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n - 1);
            permute(a, n - 1);
            swap(a, i, n - 1);
        }
    }

    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }

    public static Set getResult() {
        return result;
    }
}
