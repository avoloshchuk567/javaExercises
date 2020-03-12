package fibonacciSequenceTests;

import com.tngtech.java.junit.dataprovider.*;
import fibonacciSequence.FibonacciSequenceDefinition;
import org.hamcrest.Matchers;
import org.junit.*;
import org.junit.runner.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(DataProviderRunner.class)
public class FibonacciSequenceTest {
    FibonacciSequenceDefinition definition = new FibonacciSequenceDefinition();

    @DataProvider
    public static Object[][] data() {
        return new Object[][]{
                {10, new Integer[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55}},
                {1, new Integer[]{1}},
                {2, new Integer[]{1, 1}},
        };
    }

    @Test
    @UseDataProvider("data")
    public void sequenceOfTen(int number, Integer[] list) {
        assertThat(definition.defineFibonacciSequence(number), Matchers.contains(list));
    }

    @Test
    public void correctNumberOfReturnedValues() {
        assertThat(definition.defineFibonacciSequence(5), hasSize(equalTo(5)));
    }
}
