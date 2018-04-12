package com.pj.enumpractice;

public enum TempComplex {
	LOW(10,"VeryCold") {
		@Override
		public String displayData(String justAVariable) {
			return getValue()+" "+getText()+" Var:"+justAVariable;
		}
	},
	MID(20,"Moderate") {
		@Override
		public String displayData(String justAVariable) {
			return getValue()+" "+getText()+" Var:"+justAVariable;
		}
	},
	HIGH(30,"Hot") {
		@Override
		public String displayData(String justAVariable) {
			return getValue()+" "+getText()+" Var:"+justAVariable;
		}
	};
	
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
	private TempComplex(int value,String text)
	{
		this.value=value;
		this.text=text;
	}
	
	public abstract String displayData(String justAVariable);
}
