package com.javastreams.filereadwrite;
import java.io.*;


public class BufferedStreramCopy {
	
	private static final int BUFFER_SIZE = 4096;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "largefile.dat";
        String unbufferedDest = "unbuffered_copy.dat";
        String bufferedDest = "buffered_copy.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
	}

	public static void copyUsingUnbufferedStreams(String source, String dest) {
        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            long startTime = System.nanoTime();

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();

            System.out.println("Unbuffered Stream Time: "
                    + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error in unbuffered file copy.");
            e.printStackTrace();
        }
    }
	
	public static void copyUsingBufferedStreams(String source, String dest) {
        try (
            BufferedInputStream bis = new BufferedInputStream(
                    new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(
                    new FileOutputStream(dest))
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            long startTime = System.nanoTime();

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();

            System.out.println("Buffered Stream Time: "
                    + (endTime - startTime) / 1_000_000 + " ms");

        } catch (IOException e) {
            System.out.println("Error in buffered file copy.");
            e.printStackTrace();
        }
    }
}
