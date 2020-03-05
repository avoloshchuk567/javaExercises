package operations;

import calculator.Calculation;
import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class OperationsTest {
    Calculation calculation = new Calculation();

    @Test
    public void addition() {
        double result = calculation.calculateResult('+', 10.0, 5);
        assertThat(result, equalTo(15.0));
    }

    @Test
    public void subtraction() {
        double result = calculation.calculateResult('-', 100.0, 99);
        assertThat(result, equalTo(1.0));
    }

    @Test
    public void multiplication() {
        double result = calculation.calculateResult('*', 100.0, 100);
        assertThat(result, equalTo(10000.0));
    }

    @Test
    public void division() {
        double result = calculation.calculateResult('/', 18.6, 3);
        assertThat(result, equalTo(6.2));
    }

    @Test
    public void unsupportedOperation() {
        double result = calculation.calculateResult(')', 18.6, 3);
        assertThat(result, equalTo(-1.0));
    }
}