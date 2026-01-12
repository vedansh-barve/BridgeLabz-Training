package com.day2.traincompanion;

public class LinkedList {
	Node head;
	Node currentCoach;
	
	public void insertAtEnd(String compartmentName) {
		Node newNode = new Node(compartmentName);
		
		if(head == null) {
			head = newNode;
			currentCoach = head;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public void insertAtPos(String compartmentName, int pos) {
		Node newNode = new Node(compartmentName);

		if (pos <= 0) {
			System.out.println("Invalid Position...");
			return;
		}

		if (pos == 1) {
			newNode.next = head;
			if (head != null) {
				head.prev = newNode;
			}
			head = newNode;
			return;
		}
	        
		Node temp = head;
		int count = 1;

		while (temp != null && count < pos - 1) {
			temp = temp.next;
			count++;
		}
	        
		if (temp == null) {
			System.out.println("Invalid Position...");
			return;
		}

		newNode.next = temp.next;
		newNode.prev = temp;

		if (temp.next != null) {
			temp.next.prev = newNode;
		}

		temp.next = newNode;
	}
	
	public void deleteNode(String compartName) {
		if (head == null) {
			System.out.println("No coaches available...");
			return;
		}
		 
		if (head.compartmentName.equals(compartName)) {
			if (head.next != null) {
				head = head.next;
				head.prev = null;
			} 
			else {
				head = null;
				currentCoach = null;
			}
			return;
		}

		Node temp = head;

		while (temp.next != null && !temp.next.compartmentName.equals(compartName)) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Coach doesn't exist...");
			return;
		}

		Node nodeToDelete = temp.next;
		temp.next = nodeToDelete.next;

		if (nodeToDelete.next != null) {
			nodeToDelete.next.prev = temp;
		}
	}
	
	public void goForward() {
		if(currentCoach.next != null && currentCoach != null) {
			System.out.println("Moved Forward...");
			currentCoach = currentCoach.next;
		}
		else {
			System.out.println("You cannot move Forward....");
		}
	}
	
	public void goBackWard() {
		if(currentCoach.prev != null && currentCoach != null) {
			System.out.println("Moved Backward...");
			currentCoach = currentCoach.prev;
		}
		else {
			System.out.println("You cannot move Backward....");
		}
	}
	
	public void displayNodes() {
		if(head == null) {
			System.out.println("No Coaches right now...");
		}
		else {
			Node temp = head;
			while(temp != null) {
				if(temp.next == null) {
					System.out.print(temp.compartmentName);
				}
				else {
					System.out.print(temp.compartmentName + " -> ");
				}
				temp = temp.next;
			}
		}
	}
	
	public void showAdjacent() {
		if (currentCoach == null) {
            System.out.println("No current coach...");
            return;
        }

        System.out.println("Current : " + currentCoach.compartmentName);
        System.out.println("Previous: " + (currentCoach.prev != null ? currentCoach.prev.compartmentName : "None"));
        System.out.println("Next    : " +(currentCoach.next != null ? currentCoach.next.compartmentName : "None"));
	}
	
}
