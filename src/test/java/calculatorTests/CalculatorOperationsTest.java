package calculatorTests;

import calculator.*;
import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CalculatorOperationsTest {
    Calculation calculation = new Calculation();

    @Test
    public void addition() {
        double result = calculation.calculateResult('+', 10.0, 5).getResult();
        assertThat(result, equalTo(15.0));
    }

    @Test
    public void subtraction() {
        double result = calculation.calculateResult('-', 100.0, 99).getResult();
        assertThat(result, equalTo(1.0));
    }

    @Test
    public void multiplication() {
        double result = calculation.calculateResult('*', 100.0, 100).getResult();
        assertThat(result, equalTo(10000.0));
    }

    @Test
    public void division() {
        double result = calculation.calculateResult('/', 18.6, 3).getResult();
        assertThat(result, equalTo(6.2));
    }
}