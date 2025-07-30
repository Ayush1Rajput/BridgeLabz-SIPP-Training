package JavaStreams.ReadWriteTextFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Define source and destination file names
        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Create File object for the source
            File file = new File(sourceFile);

            // Check if source file exists
            if (!file.exists()) {
                System.out.println("Source file not found: " + sourceFile);
                return;
            }

            // Open input and output streams
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(destinationFile);

            int byteData;
            // Read and write byte by byte
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }

            System.out.println("File copied successfully to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close streams safely
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file streams: " + e.getMessage());
            }
        }
    }
}
