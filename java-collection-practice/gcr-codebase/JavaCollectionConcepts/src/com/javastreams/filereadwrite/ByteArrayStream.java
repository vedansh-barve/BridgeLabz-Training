package com.javastreams.filereadwrite;
import java.io.*;

public class ByteArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceImage = "original.jpg";
        String copiedImage = "copied.jpg";

        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();
            System.out.println("Image converted to byte array.");

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            fos = new FileOutputStream(copiedImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image recreated successfully.");

            File original = new File(sourceImage);
            File copy = new File(copiedImage);

            if (original.length() == copy.length()) {
                System.out.println("Verification successful: Files are identical.");
            } else {
                System.out.println("Verification failed: Files are different.");
            }

        } catch (IOException e) {
            System.out.println("Error handling image file.");
            e.printStackTrace();

        } finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error closing streams.");
            }
        }
	}

}
