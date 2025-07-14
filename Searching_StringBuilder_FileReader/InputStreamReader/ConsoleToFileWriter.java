package Searching_StringBuilder_FileReader.InputStreamReader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleToFileWriter {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter("output.txt");

            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                fileWriter.write(line + System.lineSeparator());
            }

            fileWriter.close();
            bufferedReader.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
