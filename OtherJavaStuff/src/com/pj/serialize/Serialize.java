package com.pj.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize {
	
	public static void main(String[] args) {
		Collar c = new Collar(10);
		Dog d = new Dog(5, c);
		
		try
		{
			FileOutputStream fos = new FileOutputStream("dogser.ser");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(d);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			FileInputStream fis = new FileInputStream("dogser.ser");
			ObjectInputStream os = new ObjectInputStream(fis);
			Dog newDog = (Dog)os.readObject();
			System.out.println(newDog.getDogNum());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
