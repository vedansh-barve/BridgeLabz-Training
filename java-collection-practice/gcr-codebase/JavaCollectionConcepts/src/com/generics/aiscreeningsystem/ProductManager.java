package com.generics.aiscreeningsystem;

public class ProductManager extends JobRole {

	public ProductManager(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}
