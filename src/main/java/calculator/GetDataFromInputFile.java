package calculator;

import org.slf4j.*;

import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

public class GetDataFromInputFile {
    private static final Logger LOGGER = LoggerFactory.getLogger(GetDataFromInputFile.class);
    private String filePath;
    private char operation;
    private double operand1;
    private double operand2;

    public GetDataFromInputFile(String filePath) {
        this.filePath = filePath;
    }

    public void readDataFromFile() {
        /*try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(filePath)));
        ) {
            StringBuilder rawDataFromFile = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                rawDataFromFile.append(line + " ");
            }
            String[] dataFromFile = rawDataFromFile.toString().split(" ");
            try {
                operation = dataFromFile[0].charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                LOGGER.error("Operation " + operation + " doesn't exist \n" + e);
            }
            try {
                operand1 = Double.parseDouble(dataFromFile[1]);
                operand2 = Double.parseDouble(dataFromFile[2]);
            } catch (NumberFormatException e) {
                LOGGER.error("Operand1 or Operand2 is incorrect \n" + e);
            }
//            bufferedReader.close();
        } catch (
                IOException e) {
            LOGGER.error("File not found \n" + e);
        }*/
        try {
            List<String> dataFromFile = Files.lines(Paths.get(filePath)).collect(Collectors.toList());
            try {
                operand1 = Double.parseDouble(dataFromFile.get(1));
                operand2 = Double.parseDouble(dataFromFile.get(2));
            } catch (NumberFormatException e) {
                LOGGER.error("Operand1 or Operand2 is incorrect \n" + e);
            }
            try {
                operation = dataFromFile.get(0).charAt(0);
            } catch (StringIndexOutOfBoundsException e) {
                LOGGER.error("Operation is incorrect \n" + e);
            }
        } catch (IOException e) {
            LOGGER.error("File not found \n" + e);
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