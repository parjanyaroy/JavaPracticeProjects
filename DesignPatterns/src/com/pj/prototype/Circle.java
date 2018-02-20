package com.pj.prototype;

public class Circle extends Shape {

	int id;

	@Override
	void drawShape() {
		System.out.println("Drawing a Circle");

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
