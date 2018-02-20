package com.pj.cloning;

public class CloneTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Author a1 = new Author("Sam", 123);
		Book b1 = new Book("ABC", 456, a1);
		Book clonedBook=(Book) b1.clone();
		System.out.println(clonedBook.bookId+" "+clonedBook.bookName+" "+clonedBook.author.authorName);
		b1.author.authorName="Sam2";
		b1.misc.add("D");
		b1.authorList.add(new Author("PRT", 456));
		b1.bookName="SomeOtherBook";
		System.out.println(clonedBook.bookId+" "+clonedBook.bookName+" "+clonedBook.author.authorName);
		// FOR SHALLOW CLONING THE REFERENCED OBJECT POINTED ARE THE SAME
		
		
		/*
		 * Conclusion: For Shallow Cloning only primitives are cloned
		 * 
		 * Collection Of Primitives or Collection of References are not copied and should be done
		 * via deep cloning
		 */
	}

}
