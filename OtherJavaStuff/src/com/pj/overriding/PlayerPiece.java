package com.pj.overriding;

public class PlayerPiece extends GameShape implements Animatable {
	int i=2;
	@Override
	public void animate() {
		System.out.println("Animate From Player Piece");
	}
	@Override
	public void displayShape()
	{
		super.displayShape();
		System.out.println("Displaying Shape Of PlayerPiece");
	}
	
	public void movePiece()
	{
		System.out.println("Move piece from PlayerPiece");
	}
	
	public void someMethod()
	{
		System.out.println("Sub class someMethod");
	}

}
