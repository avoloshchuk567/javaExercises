package calculatorTests;

import calculator.*;
import com.tngtech.java.junit.dataprovider.*;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@RunWith(DataProviderRunner.class)
public class CalculatorOperationsTest {
    Calculation calculation = new Calculation();

    @DataProvider
    public static Object[][] calculateData() {
        return new Object[][]{
                {'+', 10.0, 5, 15.0},
                {'-', 100.0, 99, 1.0},
                {'*', 100.0, 100, 10000.0},
                {'/', 18.6, 3, 6.2}
        };
    }

    @Test
    @UseDataProvider("calculateData")
    public void calculationTest(char operation, double operand1, double operand2, double result) {
        assertThat(calculation.calculateResult(operation, operand1, operand2).getResult(), equalTo(result));
    }
}