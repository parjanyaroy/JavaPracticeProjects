package com.pj.cloning;

public class Book implements Cloneable {
	
	String bookName;
	int bookId;
	Author author;
	public Book(String bookName, int bookId, Author author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
