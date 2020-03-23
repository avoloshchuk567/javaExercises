package calculator;

import org.slf4j.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class PutResultIntoOutputFile {
    private static final Logger LOGGER = LoggerFactory.getLogger(PutResultIntoOutputFile.class);
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

        /*try (FileWriter fileWriter = new FileWriter(new File(filePath))) {
            for (Object object : list) {
                fileWriter.write(object + System.getProperty("line.separator"));
            }
//            fileWriter.close(); -- obsolete if try-with-resources is used
        } catch (IOException e) {
            LOGGER.error("File not found \n" + e);
        }*/

        try {
            Files.write(Paths.get(filePath), (String.valueOf(list.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining("\n")))).getBytes());
        } catch (IOException e) {
            LOGGER.error("File not found \n" + e);
        }
    }
}