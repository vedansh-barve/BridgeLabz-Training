package com.javastreams.filereadwrite;
import java.io.*;

public class DataStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "student.dat";
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

			dos.writeInt(101);
			dos.writeUTF("Vedansh");
			dos.writeDouble(8.75);

       System.out.println("Student data written successfully.");

		} catch (IOException e) {
			System.out.println("Error writing student data.");
			e.printStackTrace();
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

       		System.out.println("\nRetrieved Student Data:");
       		System.out.println("Roll Number: " + rollNo);
       		System.out.println("Name: " + name);
       		System.out.println("GPA: " + gpa);

		} catch (IOException e) {
			System.out.println("Error reading student data.");
			e.printStackTrace();
		}
	}

}
