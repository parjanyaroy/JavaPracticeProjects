package com.pj.enumpractice;

public enum TempIntermediate {
	LOW(10,"VeryCold"),
	MID(20,"Moderate"),
	HIGH(30,"Hot");
	
	private int value;
	private String text;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	private TempIntermediate(int value,String text)
	{
		this.value=value;
		this.text=text;
	}
}
