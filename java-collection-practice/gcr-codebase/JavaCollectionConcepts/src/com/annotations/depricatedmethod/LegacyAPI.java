package com.annotations.depricatedmethod;

public class LegacyAPI {

	@Deprecated
    public void oldFeature() {
        System.out.println("Old feature executed (deprecated).");
    }

    // New recommended method
    public void newFeature() {
        System.out.println("New feature executed.");
    }
}
