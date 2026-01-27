package com.javastreams.filereadwrite.serialization;
import java.util.ArrayList;
import java.io.*;

public class EmployeeSerialization {

	public static void main(String[] args) {

        String fileName = "employees.dat";

        // Creating employee list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "IT", 50000));
        employees.add(new Employee(102, "Neha", "HR", 45000));
        employees.add(new Employee(103, "Rahul", "Finance", 55000));

        // -------- Serialization --------
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("Employees serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization.");
            e.printStackTrace();
        }

        // -------- Deserialization --------
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nDeserialized Employee Data:");
            for (Employee emp : empList) {
                emp.display();
            }

        } catch (IOException e) {
            System.out.println("Error during deserialization.");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
            e.printStackTrace();
        }
    }
}
