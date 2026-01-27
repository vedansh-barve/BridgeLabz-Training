package com.reflection.author;

public class RetrieveAuthor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = Book.class.getAnnotation(Author.class);
		System.out.println(author.name());
	}

}
