package calculator;

import java.io.*;

public class GetDataFromInputFile {
    private String filePath;
    private char operation;
    private double operand1;
    private double operand2;

    public GetDataFromInputFile(String filePath) {
        this.filePath = filePath;
    }

    public void readDataFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
            StringBuilder rawDataFromFile = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                rawDataFromFile.append(line + " ");
            }
            bufferedReader.close();
            String[] dataFromFile = rawDataFromFile.toString().split(" ");
            try {
                operation = dataFromFile[0].charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Operation " + operation + " doesn't exist \n" + e);
            }
            try {
                operand1 = Double.parseDouble(dataFromFile[1]);
                operand2 = Double.parseDouble(dataFromFile[2]);
            } catch (NumberFormatException e) {
                System.out.println("Operand1 or Operand2 is incorrect \n" + e);
            }

        } catch (
                IOException e) {
            System.out.println("File not found " + e);
        }
    }

    public char getOperation() {
        return operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }
}