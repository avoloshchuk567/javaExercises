package primeNumbersTests;

import org.junit.*;
import primeNumbers.PrimeNumbersDefinition;

import java.util.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class PrimeNumbersTest {
    PrimeNumbersDefinition primeNumbersDefinition = new PrimeNumbersDefinition();

    @Test
    public void getPrimeNumbers() {
        List<Integer> primeNumbersList = primeNumbersDefinition.getPrimeNumbers(20);
        assertThat(primeNumbersList, contains(2, 3, 5, 7, 11, 13, 17, 19));
    }
}