package com.day1.ambulanceroute;

public class CircularRoute {
	 private HospitalUnit head;
	 
	 public void addUnit(String name, boolean available) {
	        HospitalUnit newUnit = new HospitalUnit(name, available);

	        if (head == null) {
	            head = newUnit;
	            newUnit.next = head;
	            return;
	        }

	        HospitalUnit temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }

	        temp.next = newUnit;
	        newUnit.next = head;
	 }
	 
	 public void removeUnit(String unitName) {
		 if (head == null) return;

		 HospitalUnit curr = head;
		 HospitalUnit prev = null;

		 do {
			 if (curr.name.equals(unitName)) {

				 if (curr.next == head && prev == null) {
					 head = null;
					 return;
				 }

				 if (curr == head) {
					 HospitalUnit last = head;
					 while (last.next != head) {
						 last = last.next;
					 }
					 head = head.next;
					 last.next = head;
				 } 
				 else {
					 prev.next = curr.next;
				 }

				 System.out.println(unitName + " removed (maintenance)");
				 return;
			 }
			 prev = curr;
			 curr = curr.next;
		 } while (curr != head);
	 }

	 public HospitalUnit getHead() {
		 return head;
	 }

	 public void displayRoute() {
		 if (head == null) return;

		 HospitalUnit temp = head;
		 do {
			 System.out.print(temp.name + " -> ");
			 temp = temp.next;
		 } while (temp != head);

		 System.out.println("(circular)");
	 }
}
