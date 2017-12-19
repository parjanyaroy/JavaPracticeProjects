package com.pj.thread.nonblockingalgo;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {

	static InputValue op1 = new InputValue();
	static InputValue op2 = new InputValue();

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		op1.setValue(s1.nextInt());
		op2.setValue(s1.nextInt());
		String operator="+";
		BiFunction<InputValue, InputValue, Integer> result = null;

		switch (operator) {
		case "+":
			 result = (a, b) -> a.getValue() + b.getValue();
			 break;
		case "-":
			 result = (a, b) -> a.getValue() + b.getValue();
			 break;
		case "*":
			 result = (a, b) -> a.getValue() + b.getValue();
			 break;
		case "/":
			 result = (a, b) -> a.getValue() + b.getValue();
			 break;
		}
		System.out.println(result.apply(op1,op2));

	}

	interface Add {
		public int add(int a, int b);
	}

}
