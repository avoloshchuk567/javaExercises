package calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        String inputFilePath = "src/main/resources/input.txt";
        String outputFilePath = "src/main/resources/output.txt";

        GetDataFromInputFile getDataFromInputFile = new GetDataFromInputFile(inputFilePath);
        Calculation result = new Calculation();
        PutResultIntoOutputFile putResultIntoOutputFile = new PutResultIntoOutputFile(outputFilePath);

        getDataFromInputFile.readDataFromFile();

        System.out.println(getDataFromInputFile.getOperand1() + " "
                + getDataFromInputFile.getOperation() + " " + getDataFromInputFile.getOperand2() + " = "
                + result.calculateResult(getDataFromInputFile.getOperation(), getDataFromInputFile.getOperand1(), getDataFromInputFile.getOperand2()));

        putResultIntoOutputFile.writeResultToFile(getDataFromInputFile.getOperation(), getDataFromInputFile.getOperand1(), getDataFromInputFile.getOperand2(),
                result.calculateResult(getDataFromInputFile.getOperation(), getDataFromInputFile.getOperand1(), getDataFromInputFile.getOperand2()));
    }
}