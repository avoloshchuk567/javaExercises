package fibonacciSequenceTests;

import com.tngtech.java.junit.dataprovider.*;
import fibonacciSequence.FibonacciSequenceDefinition;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.*;
import org.junit.runner.RunWith;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(DataProviderRunner.class)
public class FibonacciSequenceTest {
    FibonacciSequenceDefinition definition = new FibonacciSequenceDefinition();

    @DataProvider
    public static Object[][] data(){
        return new Object[][] {
                {10, Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)},
                {1, Arrays.asList(1)},
                {2, Arrays.asList(1, 1)}
        };
    }

    @Test
    @UseDataProvider("data")
    public void sequenceOfTen(int number, List list) {
        List actualList;
        actualList = definition.defineFibonacciSequence(10);
        assertThat(actualList, Matchers. hasItems(list));//containsAll(list));
    }

    @Test
    public void sequenceOfOne() {
        assertThat(definition.defineFibonacciSequence(1), contains(1));
    }

    @Test
    public void sequenceOfTwo() {
        assertThat(definition.defineFibonacciSequence(2), contains(1, 1));
    }

    @Test
    public void correctNumberOfReturnedValues() {
        assertThat(definition.defineFibonacciSequence(5), hasSize(equalTo(5)));
    }
}
