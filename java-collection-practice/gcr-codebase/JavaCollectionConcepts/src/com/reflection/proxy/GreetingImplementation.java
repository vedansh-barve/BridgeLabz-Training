package com.reflection.proxy;

public class GreetingImplementation implements Greeting {
	@Override
    public void sayHello() {
        System.out.println("Hello User!");
    }
}
