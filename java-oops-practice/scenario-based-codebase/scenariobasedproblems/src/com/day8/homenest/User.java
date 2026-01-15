package com.day8.homenest;
import java.util.*;

public class User {
	
	private String userName;
    private List<Device> devices;

    public User(String userName) {
        this.userName = userName;
        this.devices = new ArrayList<>();
    }

    public void registerDevice(Device device) {
        devices.add(device);
        System.out.println(device.deviceId + " registered to " + userName);
    }

    public void resetAllDevices() {
        for (Device d : devices) {
            d.reset(); 
        }
    }
}
