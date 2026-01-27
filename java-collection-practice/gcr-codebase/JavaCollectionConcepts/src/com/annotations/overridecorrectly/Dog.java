package com.annotations.overridecorrectly;

public class Dog extends Animal{
	@Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
