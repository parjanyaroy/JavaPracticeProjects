package com.pj.overriding;

public class ShapeTester {
	
	public static void main(String[] args) {
		Shape s1 = new ShapeKaBachcha();
		ShapeKaBachcha s2 = new ShapeKaBachcha();
		s2.someFunction();
		// s1.someFunction(); THis is not overriding as the function is never
		// inherited as the parent its private
		
		
		// Now lets experiment with something more liberal
		s1.someLiberalFunction();
		
		System.out.println(s1.x+" "+s1.y);
		System.out.println(s2.x+" "+s2.y+" "+s2.z);
	}

}
