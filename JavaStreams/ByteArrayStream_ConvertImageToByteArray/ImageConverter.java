package JavaStreams.ByteArrayStream_ConvertImageToByteArray;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ImageConverter {

    /**
     * Converts an image file to a byte array.
     * @param imagePath The path to the input image file.
     * @param format    The image format (e.g., "png", "jpg").
     * @return A byte array representing the image.
     * @throws IOException If an error occurs during file reading or writing.
     */

    public static byte[] convertImageToBytes(String imagePath, String format) throws IOException {
        // Read the image file
        BufferedImage image = ImageIO.read(new File(imagePath));

        // Create a ByteArrayOutputStream
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Write the image to the ByteArrayOutputStream
        ImageIO.write(image, format, baos);

        // Get the byte array
        byte[] bytes = baos.toByteArray();
        return bytes;
    }

    /**
     * Converts a byte array back to a BufferedImage object.
     *
     * @param bytes The byte array representing the image.
     * @return A BufferedImage object.
     * @throws IOException If an error occurs during image reading.
     */


    public static BufferedImage convertBytesToImage(byte[] bytes) throws IOException {
        // Create a ByteArrayInputStream from the byte array
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        // Read the image from the ByteArrayInputStream
        BufferedImage newImage = ImageIO.read(bais);
        return newImage;
    }

    public static void main(String[] args) throws IOException {
        String imagePath = "image.jpg"; // Replace with your input image path
        String format = "jpg"; // Image format 

        // 1. Convert Image to Byte Array
        byte[] imageBytes = convertImageToBytes(imagePath, format);
        System.out.println("Image converted to byte array. Size: " + imageBytes.length + " bytes");

        // 2. Convert Byte Array Back to Image
        BufferedImage newImage = convertBytesToImage(imageBytes);

        // 3. Save the reconstructed image to a new file
        File outputfile = new File("output.png"); 
        ImageIO.write(newImage, format, outputfile);
        System.out.println("Byte array converted back to image ");
    }
}
