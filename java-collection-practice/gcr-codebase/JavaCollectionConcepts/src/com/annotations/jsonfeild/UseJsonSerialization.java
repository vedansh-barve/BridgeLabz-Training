package com.annotations.jsonfeild;

public class UseJsonSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User("Rahul", 25);
        
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
	}

}
