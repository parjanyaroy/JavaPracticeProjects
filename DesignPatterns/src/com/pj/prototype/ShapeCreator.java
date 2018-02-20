package com.pj.prototype;

import java.util.HashMap;

public class ShapeCreator {

	static HashMap<Integer,Shape> newMap = new HashMap<>();
	
	static void createShapeCache()
	{
		// This would actually be loaded from database
		Shape circle = new Circle();
		circle.setType(1);
		Shape rectangle = new Rectangle();
		rectangle.setType(2);
		newMap.put(circle.getType(), circle);
		newMap.put(rectangle.getType(), rectangle);
	}
	
	
	Shape getShapeFromCache(int i)
	{
		Shape cacheShape = newMap.get(i);
		if(null!=cacheShape)
			return (Shape) cacheShape.clone();
		else
			return null;
	}
	
	public static void main(String[] args) {
		createShapeCache();
		ShapeCreator s1 = new ShapeCreator();
		Shape newShape = s1.getShapeFromCache(1);
		newShape.drawShape();
	}
	
}
