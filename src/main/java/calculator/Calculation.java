package calculator;

public class Calculation {

    public double calculateResult(char operation, double operand1, double operand2) {
        double result = 0;
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
                try {
                    result = operand1 / operand2;
                } catch (Exception e) {
                    System.out.println("Division by zero" + e);
                }
                break;

            }
            default: {
                System.out.println("Operation " + operation + " doesn't exist");
                result = -1;
            }
        }
        return result;
    }
}