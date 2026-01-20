package com.generics.aiscreeningsystem;

public class DataScientist extends JobRole {

	public DataScientist(String candidateName) {
        super(candidateName);
    }

    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}
