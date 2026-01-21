package com.collections.groupobjects;
import java.util.*;

public class GroupObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = Arrays.asList(new Employee("Alice", "HR"), new Employee("Bob", "IT"), new Employee("Carol", "HR"));

		Map<String, List<Employee>> deptMap = new HashMap<>();

		for (Employee emp : employees) {
			deptMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
		}

		System.out.println(deptMap);
	}

}
