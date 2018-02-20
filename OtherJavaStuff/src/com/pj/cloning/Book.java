package com.pj.cloning;

import java.util.ArrayList;
import java.util.List;

public class Book implements Cloneable {
	
	String bookName;
	int bookId;
	Author author;
	List<String> misc;
	List<Author> authorList;
	public Book(String bookName, int bookId, Author author) {
		super();
		this.bookName = bookName;
		this.bookId = bookId;
		this.author = author;
		this.misc= new ArrayList<>();
		this.authorList= new ArrayList<>();
		this.misc.add("A");
		this.misc.add("B");
		this.misc.add("C");
		authorList.add(author);
		authorList.add(new Author("PJ", 123));
		
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		//ShallowCopy
		return super.clone();
		// DeepCopy
		//Book b1 = new Book(this.bookName, this.bookId, new Author(this.author.getAuthorName(), this.author.getAuthorId()));
		//return b1;
	}

}
