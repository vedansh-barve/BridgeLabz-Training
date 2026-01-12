package com.day2.traincompanion;

public class Train {
	
	private String name;
	LinkedList train;
	
	public Train(String name) {
		this.name = name;
		train = new LinkedList();
	}
	
	public void insertCoachAtEnd(String name) {
		train.insertAtEnd(name);
		System.out.println(name + "Train coach Inserted at End...");
	}
	
	public void insertCoachAtPos(String name, int pos) {
		train.insertAtPos(name, pos);
		System.out.println(name + "Train coach Inserted at Position...");
	}
	
	public void removeCoach(String name) {
		train.deleteNode(name);
		System.out.println(name + "Train coach Removed ...");
	}
	
	public void goforward() {
		train.goForward();
		System.out.println("Moved in forward Coach...");
	}
	
	public void gobackward() {
		train.goBackWard();
		System.out.println("Moved in backward Coach...");
	}
	
	public void showAdjacentCoaches() {
        train.showAdjacent();
    }
	
	public String getName() {
		return name;
	}
	
	public void showCoaches() {
		System.out.print(name + " : ");
		train.displayNodes();
	}
	
}
