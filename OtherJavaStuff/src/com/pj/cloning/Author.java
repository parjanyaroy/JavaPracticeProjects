package com.pj.cloning;

public class Author {
	
	String authorName;
	int authorId;
	public Author(String authorName, int authorId) {
		super();
		this.authorName = authorName;
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}
