package calculator;

import org.slf4j.*;

public class CalculatorMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorMain.class);

    public static void main(String[] args) {

        String inputFilePath = "src/main/resources/input.txt";
        String outputFilePath = "src/main/resources/output.txt";

        GetDataFromInputFile getDataFromInputFile = new GetDataFromInputFile(inputFilePath);
        Calculation calculation = new Calculation();
        PutResultIntoOutputFile putResultIntoOutputFile = new PutResultIntoOutputFile(outputFilePath);

        getDataFromInputFile.readDataFromFile();

        double operand1 = getDataFromInputFile.getOperand1();
        double operand2 = getDataFromInputFile.getOperand2();
        char operation = getDataFromInputFile.getOperation();

        double result = calculation.calculateResult(operation, operand1, operand2).getResult();

        LOGGER.info(String.format("%s %s %s = %s", operand1, operation, operand2, result));

        putResultIntoOutputFile.writeResultToFile(operation, operand1, operand2, result);
    }
}