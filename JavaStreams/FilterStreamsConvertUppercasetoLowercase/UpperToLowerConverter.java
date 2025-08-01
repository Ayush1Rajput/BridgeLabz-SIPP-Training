package JavaStreams.FilterStreamsConvertUppercasetoLowercase;

import java.io.*;

public class UpperToLowerConverter {

    public static void convertFileToLowercase(String inputFile, String outputFile) {
        // Specify encoding to handle character encoding properly
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Convert line to lowercase before writing
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion completed. Output saved to: " + outputFile);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFilePath = "input.txt";     // Provide your input file path here
        String outputFilePath = "output.txt";   // Output file

        convertFileToLowercase(inputFilePath, outputFilePath);
    }
}

