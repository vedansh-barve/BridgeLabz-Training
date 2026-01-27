package com.annotations.todo;

import java.lang.reflect.Method;
public class UseTodoAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProjectTasks tasks = new ProjectTasks();

        tasks.loginFeature();
        tasks.exportReport();

        // Reading Todo annotations using reflection
        Method[] methods = ProjectTasks.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);

                System.out.println();
                System.out.println("Method     : " + method.getName());
                System.out.println("Task       : " + todo.task());
                System.out.println("AssignedTo : " + todo.assignedTo());
                System.out.println("Priority   : " + todo.priority());
            }
        }
	}

}
