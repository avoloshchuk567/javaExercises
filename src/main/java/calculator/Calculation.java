package calculator;

public class Calculation {

    interface IntegerMath {
        double operation(double operand1, double operand2);
    }

    public double operate(double operand1, double operand2, IntegerMath op) {
        return op.operation(operand1, operand2);
    }

    public Result calculateResult(char operation, double operand1, double operand2) {
        double result;
        switch (operation) {
            case '+': {
                result = this.operate(operand1, operand2, (a, b) -> a + b);
                break;
            }
            case '-': {
                result = this.operate(operand1, operand2, (a, b) -> a - b);
                break;
            }
            case '*': {
                result = this.operate(operand1, operand2, (a, b) -> a * b);
                break;
            }
            case '/': {
                result = this.operate(operand1, operand2, (a, b) -> a / b);
                break;
            }
            default: {
                throw new java.lang.RuntimeException("Operation is not supported");
            }
        }
        return new Result(result);
    }
}