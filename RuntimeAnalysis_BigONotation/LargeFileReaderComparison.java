package RuntimeAnalysis_BigONotation;

import java.io.*;

public class LargeFileReaderComparison {
    public static void main(String[] args) {
        String filePath = "largefile.txt"; 
        
        // FileReader (Character Stream)
        try {
            long startTimeFR = System.nanoTime();
            FileReader fileReader = new FileReader(filePath);
            BufferedReader brFR = new BufferedReader(fileReader);
            while (brFR.readLine() != null) {}
            brFR.close();
            fileReader.close();
            long endTimeFR = System.nanoTime();
            System.out.printf("FileReader Time: %.2f ms%n", (endTimeFR - startTimeFR) / 1_000_000.0);
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }

        // InputStreamReader (Byte Stream to Character Stream)
        try {
            long startTimeISR = System.nanoTime();
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader brISR = new BufferedReader(isr);
            while (brISR.readLine() != null) {}
            brISR.close();
            isr.close();
            fis.close();
            long endTimeISR = System.nanoTime();
            System.out.printf("InputStreamReader Time: %.2f ms%n", (endTimeISR - startTimeISR) / 1_000_000.0);
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
    }
}
