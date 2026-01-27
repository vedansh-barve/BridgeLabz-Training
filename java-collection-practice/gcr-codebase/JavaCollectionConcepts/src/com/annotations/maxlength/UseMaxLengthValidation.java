package com.annotations.maxlength;
import java.util.Scanner;

public class UseMaxLengthValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String name = input.nextLine();
        try {
            User user = new User(name);
            System.out.println("User created: " + user.getUsername());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            
        }
        input.close();
	}

}
