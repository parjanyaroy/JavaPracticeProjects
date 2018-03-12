package com.pj.overriding;

public class GameTester {

	public static void main(String[] args) {
		GameShape gs = new PlayerPiece();
		GameShape gs2 = new GameShape();
		// Even though the reference is of GameShape at runtime the overridden method
		// of displayShape will be called.If it is not present then the parent method is
		//invoked
		gs.displayShape();
		PlayerPiece ps = new PlayerPiece();
		ps.displayShape();
		gs.someMethod();
		// Comment and uncomment the overridden method in PlayerPiece to see result
		
		// For variables if will first check the parent for value even when it is
		// overridden at the child for Parent Reference instance
		System.out.println(gs.i);
		// For Reference of the child instance it will check the child first and if not
		// found then take the value from the parent
		System.out.println(ps.i);
		
		/* gs.movePiece invokation would not be possible as the compiler looks for methods
		 * to invoke from supetype.
		 * 
		 * So rule 1: look for the method invoked by the object in super class
		 * rule 2: if present the look for an overridden implementation in the subclass
		 * If not there then process with the execution of parent method.
		 * 
		 *  
		 *  Visibility of methods can be broader in subclass
		 *  Checked Exceptions of methods can be narrower in subclass
		 */
		
		
	}
}
