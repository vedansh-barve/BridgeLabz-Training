package com.day9.bst.universityrecordsystem;

public class UniversirtRecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentBST bst = new StudentBST();
		
		bst.root = bst.insert(bst.root, 101, "Ravi");
		bst.insert(bst.root, 102, "Ritesh");
		bst.insert(bst.root, 105, "Mukesh");
		bst.insert(bst.root, 201, "Swaraj");
		
		System.out.println("Student Record Sorted...................");
		bst.inorder(bst.root);
		
		bst.delete(bst.root, 105);
		System.out.println("After Deletion...");
		bst.inorder(bst.root);
		
	}

}
