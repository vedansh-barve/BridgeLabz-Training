package com.reflection.privatefeild;
import java.lang.reflect.Field;

public class AccessPrivateField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		    Person person = new Person();
		    Field field = Person.class.getDeclaredField("age");
		    
		    field.setAccessible(true);
		    field.set(person, 30);

		    System.out.println("Updated Age: " + field.get(person));
		} 
		catch (Exception e) {
		    System.out.println("Reflection error.");
		}
	}

}
