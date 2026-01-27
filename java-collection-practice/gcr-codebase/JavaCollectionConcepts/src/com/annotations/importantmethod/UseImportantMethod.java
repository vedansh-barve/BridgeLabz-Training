package com.annotations.importantmethod;
import java.lang.reflect.Method;

public class UseImportantMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiceTasks tasks = new ServiceTasks();

        tasks.backupDatabase();
        tasks.generateReport();

        // Reading annotation details using reflection
        Method[] methods = ServiceTasks.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod info = method.getAnnotation(ImportantMethod.class);

                System.out.println();
                System.out.println("Method : " + method.getName());
                System.out.println("Level  : " + info.level());
            }
        }
	}

}
