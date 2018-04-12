package com.pj.enumpractice;

public class EnumTester {
	
	public static void main(String[] args) {
		TempSimple tmp= TempSimple.HIGH;
		switch(tmp)
		{
		case HIGH:System.out.println("High");
		break;
		case MID:System.out.println("Mid");
		break;
		case LOW:System.out.println("Low");
		break;
		}
		System.out.println("--------------------------------");
		TempIntermediate tmp2= TempIntermediate.HIGH;
		switch(tmp)
		{
		case HIGH:System.out.println(tmp2+" "+tmp2.getValue()+" "+tmp2.getText());
		break;
		case MID:System.out.println(tmp2+" "+tmp2.getValue()+" "+tmp2.getText());
		break;
		case LOW:System.out.println(tmp2+" "+tmp2.getValue()+" "+tmp2.getText());
		break;
		}
		System.out.println("--------------------------------");
		TempComplex tmp3= TempComplex.LOW;
		switch(tmp)
		{
		case HIGH:System.out.println(tmp3+" "+tmp3.displayData("Hi"));
		break;
		case MID:System.out.println(tmp3+" "+tmp3.displayData("PJ"));
		break;
		case LOW:System.out.println(tmp3+" "+tmp3.displayData("SUCHI"));
		break;
		}
	}

}
