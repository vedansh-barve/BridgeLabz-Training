package com.javastreams.filereadwrite;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            File file = new File(sourceFile);

            if (!file.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destinationFile);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        }
        catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
            e.printStackTrace();

        }
        finally {
            try {
                if (fis != null)
                    fis.close();
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                System.out.println("Error closing the file streams.");
            }
        }
	}

}
