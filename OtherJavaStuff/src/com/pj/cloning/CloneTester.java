package com.pj.cloning;

public class CloneTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Author a1 = new Author("Sam", 123);
		Book b1 = new Book("ABC", 456, a1);
		Book clonedBook=(Book) b1.clone();
		System.out.println(clonedBook.bookId+" "+clonedBook.bookName+" "+clonedBook.author.authorName);
		b1.author.authorName="Sam2";
		b1.bookName="SomeOtherBook";
		System.out.println(clonedBook.bookId+" "+clonedBook.bookName+" "+clonedBook.author.authorName);
		// FOR SHALLOW CLONING THE REFERENCED OBJECT POINTED ARE THE SAME
	}

}
