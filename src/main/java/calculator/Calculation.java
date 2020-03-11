package calculator;

public class Calculation {

    public Result calculateResult(char operation, double operand1, double operand2) {
        double result;
        switch (operation) {
            case '+': {
                result = operand1 + operand2;
                break;
            }
            case '-': {
                result = operand1 - operand2;
                break;
            }
            case '*': {
                result = operand1 * operand2;
                break;
            }
            case '/': {
                result = operand1 / operand2;
                break;
            }
            default: {
                throw new java.lang.RuntimeException("Operation is not supported");
            }
        }
        return new Result(result);
    }
}