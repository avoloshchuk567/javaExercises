package vampireNumbersTests;

import com.tngtech.java.junit.dataprovider.*;
import org.junit.*;
import org.junit.runner.*;
import vampireNumbers.Permutation;
import vampireNumbers.VampireNumbersDefinition;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(DataProviderRunner.class)
public class VampireNumbersTest {
    private VampireNumbersDefinition definition = new VampireNumbersDefinition();

    @DataProvider
    public static Object[][] numbersToDefine() {
        return new Object[][]{
                {new char[]{'1', '2', '6', '0'}, 1260, true},
                {new char[]{'1', '5', '5', '6'}, 1556, false},
                {new char[]{'9', '9', '9', '9'}, 9999, false},
                {new char[]{'6', '8', '8', '0'}, 6880, true},
        };
    }

    @Test
    @UseDataProvider("numbersToDefine")
    public void defineIfVampire(char[] c, int number, boolean result) {
        assertThat(definition.isVampire(c, number), is(result));
    }

    @Test(expected = RuntimeException.class)
    public void exceptionThrown_OnSmallNumber() {
        definition.isVampire(new char[]{'2'}, 2);
    }

    @Test(expected = RuntimeException.class)
    public void exceptionThrown_OnLargeNumber() {
        definition.isVampire(new char[]{'1', '0', '0', '0', '0'}, 10000);
    }

    @Test
    public void permutationTest() {
        Permutation.permute(new char[]{'1', '2', '6', '0'});
        assertThat((Permutation.getResult()).size(), is(24));
    }
}
