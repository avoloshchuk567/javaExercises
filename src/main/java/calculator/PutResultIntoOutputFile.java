package calculator;

import java.io.*;
import java.util.*;

public class PutResultIntoOutputFile {
    private String filePath;

    public PutResultIntoOutputFile(String filePath) {
        this.filePath = filePath;
    }

    public void writeResultToFile(char operation, double operand1, double operand2, double result) {
        char equalsSign = '=';

        List list = new ArrayList<>();
        list.add(operand1);
        list.add(operation);
        list.add(operand2);
        list.add(equalsSign);
        list.add(result);

        try {
            FileWriter fileWriter = new FileWriter(new File(filePath));
            for (Object object : list) {
                fileWriter.write(object + System.getProperty("line.separator"));
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File not found " + e);
        }
    }
}