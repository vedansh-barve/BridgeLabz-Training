package com.annotations.depricatedmethod;

public class UseDeprecatedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LegacyAPI api = new LegacyAPI();

		// Calling deprecated method
		api.oldFeature();

		// Calling new method
		api.newFeature();
	    }
	}

}
