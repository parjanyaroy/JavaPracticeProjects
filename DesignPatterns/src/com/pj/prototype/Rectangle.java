package com.pj.prototype;

public class Rectangle extends Shape {

	int id;

	@Override
	void drawShape() {
		System.out.println("Drawing a square");

	}

	@Override
	int getType() {
		return id;
	}

	@Override
	void setType(int i) {
		this.id = i;

	}

}
