package com.intermediateproblems.sortcsvrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    String id;
    String name;
    String department;
    int salary;

    Employee(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SortCSVBySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "employees.csv";
        String line;
        String splitBy = ",";

        List<Employee> employees = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);

                Employee emp = new Employee(
                        data[0],
                        data[1],
                        data[2],
                        Integer.parseInt(data[3])
                );

                employees.add(emp);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        employees.sort(Comparator.comparingInt(e -> -e.salary));

        System.out.println("Top 5 Highest-Paid Employees:");
        System.out.println("-----------------------------");

        for (int i = 0; i < Math.min(5, employees.size()); i++) {
            Employee e = employees.get(i);
            System.out.println("Name       : " + e.name);
            System.out.println("Department : " + e.department);
            System.out.println("Salary     : " + e.salary);
            System.out.println("---------------------");
        }
	}

}
