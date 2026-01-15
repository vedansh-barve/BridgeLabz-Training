package com.day8.homenest;

public abstract class Device implements IControllable {
	 protected String deviceId;
	 private boolean status;              // Encapsulated
	 protected double energyUsage;         // in kWh

	 protected String firmwareUpdateLog;

	 public Device(String deviceId, double energyUsage) {
		 this.deviceId = deviceId;
		 this.energyUsage = energyUsage;
		 this.status = false;
		 this.firmwareUpdateLog = "Initialized";
	 }

	 public boolean isOn() {
		 return status;
	 }

	 protected void setStatus(boolean status) {
		 this.status = status;
	 }

	 public double getEnergyUsage() {
		 return energyUsage;
	 }
	    
	 public double calculateMonthlyEnergy(double hoursPerDay) {
		 return energyUsage * hoursPerDay * 30;
	 }

	 protected void updateFirmware(String version) {
		 firmwareUpdateLog = "Updated to version " + version;
	 }

	 @Override
	 public void turnOn() {
		 setStatus(true);
	 }

	 @Override
	 public void turnOff() {
		 setStatus(false);
	 }

	 @Override
	 public abstract void reset();
}
